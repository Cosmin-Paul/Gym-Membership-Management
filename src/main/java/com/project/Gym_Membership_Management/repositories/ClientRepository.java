package com.project.Gym_Membership_Management.repositories;

import com.project.Gym_Membership_Management.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}