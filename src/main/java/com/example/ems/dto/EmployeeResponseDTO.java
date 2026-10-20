package com.example.ems.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String department;
    private Double salary;
}