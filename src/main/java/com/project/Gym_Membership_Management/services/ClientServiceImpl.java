package com.project.Gym_Membership_Management.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Gym_Membership_Management.models.entities.Client;
import com.project.Gym_Membership_Management.repositories.GymTrackerRepository;
import com.project.Gym_Membership_Management.repositories.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {
    private final ObjectMapper objectMapper;
    private final ClientRepository clientRepository;
    private final GymTrackerRepository gymTrackerRepository;


    public Client createUser(Client client) {
        if (client.getEmail().length()<5) {
            throw new RuntimeException("Invalid e-mail adress! Please review your e-mail adress!");
        }
client.setId(UUID.randomUUID());
        users.add(client);
        log.info("User {} was saved!");
        return client;
    }

    @Override
    public List<Client> getUsers(Long id) {
        return List.of();
    }

}
