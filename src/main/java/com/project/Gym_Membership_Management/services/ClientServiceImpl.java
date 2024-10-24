package com.project.Gym_Membership_Management.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Gym_Membership_Management.exceptions.ClientNotFoundException;
import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.entities.Client;
import com.project.Gym_Membership_Management.models.entities.GymTracker;
import com.project.Gym_Membership_Management.repositories.GymTrackerRepository;
import com.project.Gym_Membership_Management.repositories.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {
    private final ObjectMapper objectMapper;
    private final ClientRepository clientRepository;
    private final GymTrackerRepository gymTrackerRepository;

    public ClientServiceImpl(ObjectMapper objectMapper, ClientRepository clientRepository, GymTrackerRepository gymTrackerRepository) {
        this.objectMapper = objectMapper;
        this.clientRepository = clientRepository;
        this.gymTrackerRepository = gymTrackerRepository;
    }

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client clientEntityToBeSaved = objectMapper.convertValue(clientDTO, Client.class);
        Client clientResponseEntity = clientRepository.save(clientEntityToBeSaved);
        return objectMapper.convertValue(clientResponseEntity, ClientDTO.class);
    }

    @Override
    public List<GymTrackerDTO> getClient(Long id) {
        Optional<Client> clientIsRegistred = clientRepository.findById(id);
        if (!clientIsRegistred.isPresent()) {
            throw new RuntimeException("User with ID " + id + " is not found");
        }
        Client client = clientIsRegistred.get();
        Optional<GymTracker> gymTrackers = gymTrackerRepository.findById(id);
        List<GymTrackerDTO> listGymTrackers = gymTrackers.stream()
                .map(GymTrackerDTO::mapGymTrackerToGymTrackerDTO)
                .toList();
        listGymTrackers.forEach(gymTrackerDTO -> gymTrackerDTO.setId(client.getId()));
        return listGymTrackers;
    }


    @Override
    public List<GymTrackerDTO> updateClient(Long clientId, int client) {
        Client client = clientRepository.findById(clientId).orElseThrow(()-> new ClientNotFoundException("Client with id " + clientId + " is not found"));
        client.setId((new Client()).getId());
        Client updateClient = clientRepository.save(client);
        log.info(("Updated info for client id{}"));
return objectMapper.convertValue(updateClient,ClientDTO.class);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(" The client is deleted"
                ));
        clientRepository.deleteById(id);
        log.info("Client with id {} was deleted", id);
    }
}