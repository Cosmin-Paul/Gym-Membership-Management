package com.project.Gym_Membership_Management.models.dtos;

import lombok.Data;

@Data
public class RequestClientDTO {

    private String firstName;
    private String lastName;
    private String email;
    private char sex;
}
