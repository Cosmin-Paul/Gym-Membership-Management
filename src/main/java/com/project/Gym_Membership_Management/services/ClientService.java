package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.entities.Client;

import java.util.List;

public interface ClientService {

    ClientDTO createClient(ClientDTO clientDTO);

List<GymTrackerDTO> getClient(Long id);

}
