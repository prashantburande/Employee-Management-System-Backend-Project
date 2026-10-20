package com.example.ems.dto;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class EmployeeRequestDTO {

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String department;

    @Positive
    private Double salary;
}