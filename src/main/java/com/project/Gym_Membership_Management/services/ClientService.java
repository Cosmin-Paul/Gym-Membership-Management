package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    ClientDTO createClient(ClientDTO clientDTO);


    List<ClientDTO> getClients();

    ClientDTO updateClient(Long clientId, ClientDTO clientDTO);

    void deleteClientById(Long id);


}
