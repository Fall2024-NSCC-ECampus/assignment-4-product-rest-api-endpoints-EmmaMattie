package com.example.restapiendpoints.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restapiendpoints.Entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
