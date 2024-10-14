package com.project.Gym_Membership_Management.services;

import com.project.Gym_Membership_Management.models.entities.Client;

import java.util.List;

public interface ClientService {

    Client createUser (Client client);

List<Client> getUsers(Long id);

}
