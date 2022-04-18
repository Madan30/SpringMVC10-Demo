package com.NepalCode.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NepalCode.api.LoginDTO;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String loginPage(@ModelAttribute("loginInfo") LoginDTO loginDTO) {
		
		// reading the existing property value by featching it from loginDTO
		
		return "login-page";
	}
	
	@RequestMapping("/login")
	public String showloginProcess(@Valid@ModelAttribute("loginInfo") LoginDTO loginDTO, BindingResult result) {
		// always use @Valid annotation before the @ModelAttribute
		// always use DataBinding after the DTO 
		// otherwise it will give you error
		
		// checking whether result has error or not
		if(result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			
			for(ObjectError temp: allErrors) {
				System.out.println(temp);
			}
			
			return "login-page";
			
		}
		return "login-process";
		
	}

}
