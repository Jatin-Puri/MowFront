package com.niit.fooddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.fooddemo.model.Customer;
import com.niit.fooddemo.service.CustomerService;


@Controller
@RequestMapping("/customer")   //@RequestMapping using in the class level
public class CutomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/showForm")    //@RequestMapping using in the method level ,it has default GET method
	public String showFormForAdd(ModelMap theModel)
	{
		Customer theCustomer=new Customer();
		theModel.addAttribute(""
				+ "",theCustomer);
	
		return "customer-form";  //return model + view name
	}
	
	
	@PostMapping(value="/saveCustomer")    
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/user/loginForm";  
	}

	


	
	
}
