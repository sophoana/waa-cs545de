package com.students.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

	@Override
	public void initialize(PhoneNumber constraintAnnotation) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.isEmpty())
			return false;

		if (value.length() != 10)
			return false;

		String regex = "[0-9]+";

		if (java.util.regex.Pattern.matches(regex, value))
			return true;

		return false;
	}

}
