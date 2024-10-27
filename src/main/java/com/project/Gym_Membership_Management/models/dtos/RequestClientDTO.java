package com.project.Gym_Membership_Management.models.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class RequestClientDTO {

    private String firstName;
    private String lastName;

    @NotBlank(message = "This field is mandatory!")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$\", message = \"Email should be valid")
    private String email;
    private char sex;
}