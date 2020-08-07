package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class WeightForm {

	@NotEmpty(message = " 身長を入力して下さい")
	@Pattern(regexp = "\\d{3}", message = "半角数字、3ケタでお願いいたします")
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}