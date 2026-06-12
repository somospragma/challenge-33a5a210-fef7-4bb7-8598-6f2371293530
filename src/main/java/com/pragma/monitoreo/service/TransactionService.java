package com.pragma.monitoreo.service;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private final MeterRegistry meterRegistry;

    public TransactionService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    public void processTransaction() {
        meterRegistry.counter("transactions.processed").increment();
    }
}