package com.ictu3091081.Services;

import com.ictu3091081.Respiratory.PaymentRepository;
import com.ictu3091081.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        // Implement payment processing logic here (e.g., integrate with payment gateway)
        return paymentRepository.save(payment);
    }
}