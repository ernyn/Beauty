package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class WeightForm {

@NotEmpty(message = "身長を入力して下さい")
private String number;

public String getNumber() {
return number;
}

public void setNumber(String number) {
this.number = number;
}

}