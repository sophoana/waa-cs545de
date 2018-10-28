package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.CalculatorOperand;

public class CalculatorValidatorImpl implements CalculatorValidator {

	@Override
	public List<String> validate(Object object) {
		List<String> errors = new ArrayList<>();
		CalculatorOperand oper = (CalculatorOperand) object;

		Integer add1 = oper.getAdd1();
		if (add1 == null)
			errors.add("Invalid Add1");

		Integer add2 = oper.getAdd2();
		if (add2 == null)
			errors.add("Invalid Add2");

		Integer mul1 = oper.getMult1();
		if (mul1 == null)
			errors.add("Mult1 is Invalid");
		
		Integer mul2 = oper.getMult2();
		if(mul2 == null)
			errors.add("Mult2 is Invalid");

		return errors;
	}

}
