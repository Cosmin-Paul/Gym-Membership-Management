package com.project.Gym_Membership_Management.repositories;

import com.project.Gym_Membership_Management.models.entities.GymTracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymTrackerRepository extends JpaRepository<GymTracker, Long> {
}
