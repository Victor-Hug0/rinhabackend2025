package com.victor.rinhaBackend2025.repository;

import com.victor.rinhaBackend2025.entity.Payment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PaymentRepository extends ReactiveCrudRepository<Payment, Long> {
}
