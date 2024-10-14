package com.project.Gym_Membership_Management.controllers;

import com.project.Gym_Membership_Management.models.entities.Client;
import com.project.Gym_Membership_Management.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final ClientService clientService;

    public UserController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/api/users")
    public ResponseEntity<Client> createUser(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.createUser(client));
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<Client>> getUsers(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.getUsers());
    }
}
