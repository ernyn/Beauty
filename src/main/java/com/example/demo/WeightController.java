package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeightController {

@ModelAttribute
public WeightForm setUpForm() {
return new WeightForm();
}

@RequestMapping("/input")
public String index() {
return "index.html";
}

@RequestMapping("/output")
public String result(@Validated WeightForm WeightForm, BindingResult bindingResult, Model model) {
if (bindingResult.hasErrors()) {
return "index.html";
}

String number = WeightForm.getNumber();
String name = "コントローラー太郎";
model.addAttribute("number", number);
model.addAttribute("name", name);
return "output.html";
}

}