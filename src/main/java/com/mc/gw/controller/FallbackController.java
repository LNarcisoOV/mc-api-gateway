package com.mc.gw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(FallbackController.class);

    @GetMapping("/customer-address")
    Flux<Void> getCustomerAddressFallback() {
        LOGGER.error("Customer Address service unavailable.");
        return Flux.empty();
    }
    
    @GetMapping("/zip-code-validator")
    Flux<Void> getZipCodeValidatorFallback() {
        LOGGER.error("Zip Validator service unavailable.");
        return Flux.empty();
    }
    
    @GetMapping("/user-service")
    Flux<Void> getUserServiceFallback() {
        LOGGER.error("User service unavailable.");
        return Flux.empty();
    }

}
