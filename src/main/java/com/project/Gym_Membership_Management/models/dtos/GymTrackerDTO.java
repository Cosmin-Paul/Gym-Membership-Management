package com.project.Gym_Membership_Management.models.dtos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.project.Gym_Membership_Management.models.entities.GymTracker;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table
public class GymTrackerDTO {
    private Long id;
    private String name;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime registrationDateTime;
    private Long clientId;

    public static GymTrackerDTO mapGymTrackerToGymTrackerDTO(GymTracker gymTracker) {
        GymTrackerDTO gymTrackerDTO = new GymTrackerDTO();
        gymTrackerDTO.setId((gymTrackerDTO.getId()));
        gymTracker.setRegistrationDateTime(gymTracker.getRegistrationDateTime());
        gymTracker.setName(gymTrackerDTO.getName());
        gymTracker.setClientId(gymTracker.getClientId());
        return gymTrackerDTO;
    }

    public static GymTracker mapGymTrackerDTOToGymTracker(GymTrackerDTO gymTrackerDTO) {
        GymTracker gymTracker = new GymTracker();
        gymTracker.setId(gymTrackerDTO.getId());
        gymTracker.setRegistrationDateTime(gymTrackerDTO.registrationDateTime);
        gymTracker.setName(gymTrackerDTO.getName());
        return gymTracker;
    }
}