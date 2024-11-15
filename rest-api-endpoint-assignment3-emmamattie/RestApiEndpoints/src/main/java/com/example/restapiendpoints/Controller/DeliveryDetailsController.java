package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.DeliveryDetails;
import com.example.restapiendpoints.Repositories.DeliveryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/orders/{id}/delivery-details")
public class DeliveryDetailsController {

    @Autowired
    private DeliveryDetailsRepository deliveryDetailsRepository;

    @PostMapping
    public void addDeliveryDetails(@PathVariable int id) {
        deliveryDetailsRepository.save(new DeliveryDetails(id));
    }

    @GetMapping
    public Optional<DeliveryDetails> getAllDeliveryDetails(@PathVariable int id) {
        return deliveryDetailsRepository.findById(id);
    }

    @DeleteMapping
    public void deleteDeliveryDetails(@PathVariable int id) {
        deliveryDetailsRepository.deleteById(id);
    }
}

