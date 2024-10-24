package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClientService {

    ClientDTO createClient(ClientDTO clientDTO);

static List<GymTrackerDTO> getClient(Long id);

    List<GymTrackerDTO> getClient(Long id);

    List<GymTrackerDTO> updateClient(Long clientId, int Client);

void deleteClientById(Long id);


}
