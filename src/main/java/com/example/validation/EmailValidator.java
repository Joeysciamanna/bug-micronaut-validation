package com.example.validation;

import io.micronaut.context.annotation.Factory;
import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.validation.validator.constraints.ConstraintValidator;
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext;
import jakarta.inject.Singleton;

@Factory
public class EmailValidator  {

//    @Singleton
//    public ConstraintValidator<Email, String> hexColorValidator() {
//        return (v, m, c) -> isValidEmail(v);
//    }
//
//    private static boolean isValidEmail(String value) {
//        System.out.println("Validating " + value);
//        return value.contains("@");
//    }
//
//
//    @Override
//    public boolean isValid(@Nullable String value, @NonNull AnnotationValue<Email> annotationMetadata, @NonNull ConstraintValidatorContext context) {
//        System.out.println("VVal2");
//        return false;
//    }

}
