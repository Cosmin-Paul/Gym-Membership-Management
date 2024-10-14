package com.project.Gym_Membership_Management.models.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;

    //private Set
}
