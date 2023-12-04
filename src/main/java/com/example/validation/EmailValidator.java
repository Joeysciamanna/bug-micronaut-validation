package com.example.validation;

import io.micronaut.validation.validator.constraints.ConstraintValidator;
import jakarta.inject.Singleton;

public class EmailValidator {

    @Singleton
    public ConstraintValidator<Email, String> hexColorValidator() {
        return (v, m, c) -> isValidEmail(v);
    }

    private static boolean isValidEmail(String value) {
        System.out.println("Validating " + value);
        return value.contains("@");
    }


}
