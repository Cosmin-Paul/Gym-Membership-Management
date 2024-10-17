package com.project.Gym_Membership_Management.controllers;


import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.services.GymTrackerService;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class GymTrackerController {
    private final GymTrackerService gymTrackerService;

    public GymTrackerController(GymTrackerService gymTrackerService) {
        this.gymTrackerService = gymTrackerService;
    }

    @GetMapping("/{id}/clients")
    public ResponseEntity<List<ClientDTO>> getRegisteredClients(@PathVariable("id") Long gymTrackerId) {
        return ResponseEntity.ok(gymTrackerService.getRegisteredClients(gymTrackerId));
    }
}