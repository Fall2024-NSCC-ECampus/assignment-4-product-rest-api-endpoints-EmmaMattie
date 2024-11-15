package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Payment;
import com.example.restapiendpoints.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders/{orderId}/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/{paymentId}")
    public Optional<Payment> getPayment(@PathVariable int paymentId) {
        return paymentRepository.findById(paymentId);
    }

    @PostMapping
    public void addPayment(@RequestBody Payment payment) {
        paymentRepository.save(payment);
    }

    @DeleteMapping("/{paymentId}")
    public void deletePayment(@PathVariable int paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
