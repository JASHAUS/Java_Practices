package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {
	
	@GetMapping(value="/userlogin") //
	public String loadPage(Model model)
	{
	User user = new User();
	model.addAttribute("alias", user);
	return "login" ;
	}
	
	@PostMapping(value="/login")
	public ModelAndView loginFunction(@Valid @ModelAttribute("alias") User user,BindingResult bindingResult )
	{
		/*System.out.println(user.getUserName());
		
    //	model.addAttribute("key", user);
		ModelAndView modelAndView = new ModelAndView("userSuccess");
		modelAndView.addObject("key",user);
		return modelAndView;*/
		
		ModelAndView modelAndView;
		if(bindingResult.hasErrors())
		{
		return modelAndView = new ModelAndView("login");
		}
		
		modelAndView = new ModelAndView("userSuccess");
		modelAndView.addObject("key",user);
		return modelAndView;
	}
 }


