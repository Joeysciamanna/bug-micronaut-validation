package com.example.validation;

import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext;
import jakarta.inject.Singleton;
import jakarta.validation.ConstraintValidator;

@Singleton
public class EmailConstraintValidator implements ConstraintValidator<Email, String>, io.micronaut.validation.validator.constraints.ConstraintValidator<Email, String > {

    @Override
    public boolean isValid(@Nullable String value, @NonNull AnnotationValue<Email> annotationMetadata, @NonNull ConstraintValidatorContext context) {
        System.out.println("1asd");
        return false;
    }

    @Override
    public boolean isValid(String value, jakarta.validation.ConstraintValidatorContext context) {
        System.out.println("2asd");
        return false;
    }

}
