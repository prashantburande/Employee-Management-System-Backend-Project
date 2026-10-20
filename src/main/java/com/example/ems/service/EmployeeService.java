package com.example.ems.service;

import com.example.ems.dto.*;

import org.springframework.data.domain.Page;

public interface EmployeeService {

    EmployeeResponseDTO createEmployee(EmployeeRequestDTO dto);

    EmployeeResponseDTO getEmployee(Long id);

    Page<EmployeeResponseDTO> getAllEmployees(
            int page,
            int size,
            String sortBy);

    EmployeeResponseDTO updateEmployee(
            Long id,
            EmployeeRequestDTO dto);

    void deleteEmployee(Long id);
}