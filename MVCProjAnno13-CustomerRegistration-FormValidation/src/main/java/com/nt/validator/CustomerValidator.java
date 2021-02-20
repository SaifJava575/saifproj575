//customer validator.java
package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Customer;

@Component("custValidator")
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerValidator.supports()");
		//to check wheather correct model class is comming or not
		return clazz.isAssignableFrom(Customer.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("CustomerValidator.validate()");
		//type casting
		Customer cust=(Customer)target;
		//form validation logics (server side)
		if(cust.getCname()==null || cust.getCname().isEmpty()) //required rules
			errors.rejectValue("cname","cname.required");
		else if(cust.getCname().length()<5) //minimum rule
			errors.rejectValue("cname","cname.minlen");
		
		if(cust.getCadd()==null || cust.getCadd().isEmpty()) //required rules
			errors.rejectValue("cadd", "cadd.required");
		else if(cust.getCadd().length()<8) //minimum rule
			errors.rejectValue("cadd", "cadd.minlen");
		
		if(cust.getBillAmt()==null) //required rule
			errors.rejectValue("billAmt","billAmt.required");
		else if(cust.getBillAmt()<=0)//minimum rule
			errors.rejectValue("billAmt", "billAmt.positive");

	}

}
