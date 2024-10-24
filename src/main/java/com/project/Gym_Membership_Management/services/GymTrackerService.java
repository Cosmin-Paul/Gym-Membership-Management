package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public interface GymTrackerService {
    GymTrackerDTO createClient(GymTrackerDTO gymTrackerDTO);

    List<GymTrackerDTO> deleteClient();

    List<GymTrackerDTO> updateClient(GymTrackerDTO gymTrackerDTO);

    List<ClientDTO> getRegisteredClients(Long clientId);

}
