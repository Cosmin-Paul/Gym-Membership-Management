package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.dtos.ClientDTO;

import java.util.List;

public interface GymTrackerService {
    GymTrackerDTO createClient(GymTrackerDTO gymTrackerDTO);

    List<GymTrackerDTO> deleteClient();

    List<GymTrackerDTO> updateClient(GymTrackerDTO gymTrackerDTO);

    List<ClientDTO> getRegisteredMembers (Long clientId);
}
