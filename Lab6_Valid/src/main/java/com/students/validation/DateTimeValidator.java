package com.students.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateTimeValidator implements ConstraintValidator<DateTimeAttrib, String> {

	private final SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");

	private DateTimeAttrib constraintAnnotation;

	@Override
	public void initialize(DateTimeAttrib constraintAnnotation) {
		this.constraintAnnotation = constraintAnnotation;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		try {
			
			if(value == null || value.isEmpty())
				return false;
			
			dateParser.setLenient(false);
			Date date = dateParser.parse(value);
			
			final Date min = dateParser.parse(constraintAnnotation.min());
			final Date max = dateParser.parse(constraintAnnotation.max());
			return (date.after(min) && date.before(max));

		} catch (ParseException ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

}
