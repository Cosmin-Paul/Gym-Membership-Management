package com.project.Gym_Membership_Management.models.dtos;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ClientDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;
    private char sex;

    private Set<GymTrackerDTO> gymManagement = new HashSet();
}