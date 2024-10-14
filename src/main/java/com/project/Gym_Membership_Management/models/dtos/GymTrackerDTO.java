package com.project.Gym_Membership_Management.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class GymTrackerDTO {

    private Long id;
    private String description;
    private LocalDateTime courseScheduleTime;
    private DayOfWeek courseDay;
    private List<ClientDTO> registredMembers = new ArrayList<>();

    }
