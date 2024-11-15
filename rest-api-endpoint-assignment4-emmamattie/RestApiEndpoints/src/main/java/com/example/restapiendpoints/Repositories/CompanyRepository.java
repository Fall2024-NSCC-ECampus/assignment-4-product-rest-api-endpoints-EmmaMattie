package com.example.restapiendpoints.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restapiendpoints.Entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Additional custom methods if needed
}
