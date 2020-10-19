package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class AppController {
	
	@GetMapping(value = {"/abc","efg"})
	public String firstFunction()
	{
		System.out.println("First Function");
		return "welcome";
	}
    @GetMapping(value = "hij")
	public String secondFunction(@RequestParam ("userName") String val1,@RequestParam ("password") String val2)
	{
		System.out.println("Second Function" + " "+val1 + " " +val2);
		return "welcome";
	}
    @GetMapping(value = "lmn/{alias}/{alias1}")
	public String thirdFunction(@PathVariable("alias") String val1,@PathVariable("alias1") String val2)
	{
		System.out.println("Third Function"+ " "+ val1 + " " +val2);
		return "welcome";
	}
    @GetMapping(value = "carry")
   	public String fourthFunction(Model model)
   	{
   		System.out.println("Fourth Function");
   		model.addAttribute("key1","Sample");
   		
   		return "success";
   	}
    @GetMapping(value= "carry1")
    public String fifthFunction(Model model)
    {
    	Student student = new Student(51887288, "Usha");
    	model.addAttribute("key2", student);
    	return "success"; 
    }
}
