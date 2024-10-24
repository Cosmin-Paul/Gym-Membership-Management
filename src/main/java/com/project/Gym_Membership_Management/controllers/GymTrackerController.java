package com.project.Gym_Membership_Management.controllers;


import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.services.GymTrackerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gym-trackers")
public class GymTrackerController {
    private final GymTrackerService gymTrackerService;

    public GymTrackerController(GymTrackerService gymTrackerService) {
        this.gymTrackerService = gymTrackerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ClientDTO>> getRegisteredClients(@PathVariable("id") Long gymTrackerId) {
        return ResponseEntity.ok(gymTrackerService.getRegisteredClients(gymTrackerId));
    }
}