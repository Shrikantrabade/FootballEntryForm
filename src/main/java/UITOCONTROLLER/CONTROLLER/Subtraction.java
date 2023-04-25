package UITOCONTROLLER.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Subtraction {

	@GetMapping("/sub{a}/{b}")
	public String sub(@PathVariable int a, @PathVariable int b,Model model) 
	{
		int c=a-b;
		String msg="sub of a and b";
		model.addAttribute("SUB", msg);
		return "sub";
		
		
		
	}
	
	
}

