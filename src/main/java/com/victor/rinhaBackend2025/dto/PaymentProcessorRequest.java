package com.victor.rinhaBackend2025.dto;

import reactor.util.annotation.NonNull;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record PaymentProcessorRequest(
        @NonNull
        UUID correlationId,
        @NonNull
        BigDecimal amount,
        @NonNull
        Instant processedAt
) {
}
