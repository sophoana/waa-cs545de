package com.students.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateTimeValidator.class)
@Documented
public @interface DateTimeAttrib {

	String message() default "{student.dateofbirth.error.message}";

	Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {};

    String min() default "01/01/1900";
    String max() default "12/31/2999";
}
