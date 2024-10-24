package com.project.Gym_Membership_Management.controllers;

import com.project.Gym_Membership_Management.models.dtos.ClientDTO;
import com.project.Gym_Membership_Management.models.dtos.GymTrackerDTO;
import com.project.Gym_Membership_Management.models.entities.Client;
import com.project.Gym_Membership_Management.models.entities.GymTracker;
import com.project.Gym_Membership_Management.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.FileLock;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<GymTrackerDTO>> getClientGymTrackers(@PathVariable Long id) {
        return ResponseEntity.ok(ClientService.getClient(id));
    }

    @PostMapping
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.ok(clientService.createClient(clientDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientDTO clientDTO ) {
        return ResponseEntity.ok(ClientService.getClient(id);
    }


    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClients(
            @RequestParam(value = "first name", required = false) String firstName,
            @RequestParam(value = "last name", required = false) String lastName,
            @RequestParam(value = "email", required = false) String email) {
        return ResponseEntity.ok(ClientService.getClient(822268L);
}
}