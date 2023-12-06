package com.poja.prime.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

@RestController
public class PrimeController {

    @GetMapping("/new-prime")
    public String getNewPrime() {
        int bitLength = 100; 
        SecureRandom random = new SecureRandom();

        long startTime = System.currentTimeMillis();
        BigInteger prime = BigInteger.probablePrime(bitLength, random);
        long endTime = System.currentTimeMillis();

        System.out.println("Temps de génération : " + (endTime - startTime) + " ms");

        return prime.toString();
    }
}
