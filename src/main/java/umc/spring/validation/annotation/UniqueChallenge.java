package umc.spring.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import umc.spring.validation.validator.UniqueChallengeValidator;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueChallengeValidator.class)
public @interface UniqueChallenge {
    String message() default "This challenge is already taken.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
