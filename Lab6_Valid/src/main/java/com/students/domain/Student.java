package com.students.domain;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.students.validation.DateTimeAttrib;
import com.students.validation.PhoneNumber;

public class Student {

	@Digits(integer = 4, fraction = 0, message = "{student.id.error.message}")
	private int id;

	@Size(min = 4, max = 50, message = "{firstname.size.error.message}")
	private String firstName = null;

	@Size(min = 4, max = 50, message = "{lastname.size.error.message}")
	private String lastName = null;

	@NotNull
	@Email(message="{email.format.error.message}")
	private String email = null;

	@NotNull(message = "{student.gender.error.message}")
	@Pattern(regexp = "(Male|Female)", message = "{student.gender.error.message}")
	private String gender;

	@DateTimeAttrib
	private String birthday;

	@PhoneNumber
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
