package com.victor.rinhaBackend2025.dto;

import reactor.util.annotation.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentRequest(
        @NonNull
        UUID correlationId,
        @NonNull
        BigDecimal amount
) {
}
