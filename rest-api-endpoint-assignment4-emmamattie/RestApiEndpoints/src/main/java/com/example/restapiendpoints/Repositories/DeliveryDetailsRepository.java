package com.example.restapiendpoints.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restapiendpoints.Entities.DeliveryDetails;

public interface DeliveryDetailsRepository extends CrudRepository<DeliveryDetails, Integer> {

}
