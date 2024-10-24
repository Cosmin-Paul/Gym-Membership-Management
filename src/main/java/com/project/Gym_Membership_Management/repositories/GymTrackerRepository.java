package com.project.Gym_Membership_Management.repositories;

import com.project.Gym_Membership_Management.models.entities.GymTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GymTrackerRepository extends JpaRepository<GymTracker, Long> {

    List<GymTracker> findByClassSubscriptionDateTimeBetweenAndLocationContainingIgnoreCaseOrderByClassSubscriptionDateTime(LocalDateTime from, LocalDateTime to, String registred);
    List<GymTracker> findByEventDateTimeBetweenAndLocationContainingIgnoreCaseOrderByLocationAsc(LocalDateTime from, LocalDateTime to, String registred);
    List<GymTracker> findByClientId(Long clientId);
}