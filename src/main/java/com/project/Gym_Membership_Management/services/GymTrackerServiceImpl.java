package com.project.Gym_Membership_Management.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.entities.Client;
import com.project.Gym_Membership_Management.models.entities.GymTracker;
import com.project.Gym_Membership_Management.repositories.ClientRepository;
import com.project.Gym_Membership_Management.repositories.GymTrackerRepository;

import java.util.List;

public class GymTrackerServiceImpl implements GymTrackerService {
    private final ObjectMapper objectMapper;
    private final ClientRepository clientRepository;
    private final GymTrackerRepository gymTrackerRepository;


    public GymTrackerServiceImpl(ObjectMapper objectMapper, ClientRepository clientRepository, GymTrackerRepository gymTrackerRepository) {
        this.objectMapper = objectMapper;
        this.clientRepository = clientRepository;
        this.gymTrackerRepository = gymTrackerRepository;
    }

    @Override
    public GymTrackerDTO createClient(GymTrackerDTO gymTrackerDTO) {
        Client  client = clientRepository.findById(gymTrackerDTO.getClientId()).orElseThrow(() -> new RuntimeException("Client with the id {}" + gymTrackerDTO.getClientId() + "is not found"));
        GymTracker gymTrackerEntityToBeSaved = GymTrackerDTO.mapGymTrackerDTOToGymTracker(gymTrackerDTO);
        gymTrackerEntityToBeSaved.setClientId(client.getId());
 GymTracker gymTrackerResponseEntity = gymTrackerRepository.save(gymTrackerEntityToBeSaved);
 return GymTrackerDTO.mapGymTrackerToGymTrackerDTO(gymTrackerResponseEntity);
    }

    @Override
    public List<GymTrackerDTO> deleteClient() {
        return List.of();
    }

    @Override
    public List<GymTrackerDTO> updateClient(GymTrackerDTO gymTrackerDTO) {
        return List.of();
    }

    @Override
    public List<ClientDTO> getRegisteredClients(Long clientId) {
        return List.of();
    }

}