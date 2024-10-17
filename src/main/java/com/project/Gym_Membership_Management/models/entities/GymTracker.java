package com.project.Gym_Membership_Management.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gym_tracker")
public class GymTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column
    private String name;
    @Column(name = "Registration_date_time")
    private LocalDateTime RegistrationDateTime;
    @Column(name = "subscription_class")
    private String SubscriptionClass;
@Column(name = "client_id")
    private Long clientId;

    @OneToMany
    @JoinTable(
            name = "gym_members",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "class_subscription_id")
    )
    private List<Client> classParticipants = new ArrayList<>();
        }