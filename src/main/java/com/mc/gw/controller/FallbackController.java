package com.mc.gw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/customer-address")
    Flux<Void> getCustomerAddressFallback() {
        return Flux.empty();
    }
    
    @GetMapping("/zip-code-validator")
    Flux<Void> getZipCodeValidatorFallback() {
        return Flux.empty();
    }
    
    @GetMapping("/user-service")
    Flux<Void> getUserServiceFallback() {
        return Flux.empty();
    }

}
