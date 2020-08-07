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
public String result(@Validated WeightForm weightForm, BindingResult bindingResult, Model model) {
if (bindingResult.hasErrors()) {
return "index.html";
}

int number = weightForm.getNumber();
//String name = "コントローラー太郎";

//サービス層から身長を検索
WeightService weightService = new WeightServiceImpl();
int name = weightService.findByNo(number);

model.addAttribute("number", number);
model.addAttribute("name", name);
return "output.html";
}

}