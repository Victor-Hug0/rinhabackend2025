package com.victor.rinhaBackend2025.entity;

import com.victor.rinhaBackend2025.entity.enums.PaymentProcessor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Table(name = "payments")
public class Payment {

    @Id
    private Long id;

    @Column("correlation_id")
    private UUID correlationId;

    private BigDecimal amount;

    @Column("processed_at")
    private Instant processedAt;

    private PaymentProcessor processor;

    public Payment(UUID correlationId, BigDecimal amount, Instant processedAt, PaymentProcessor processor) {
        this.correlationId = correlationId;
        this.amount = amount;
        this.processedAt = processedAt;
        this.processor = processor;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(Instant processedAt) {
        this.processedAt = processedAt;
    }

    public PaymentProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(PaymentProcessor processor) {
        this.processor = processor;
    }
}
