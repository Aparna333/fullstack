package com.cts.pms.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.pms.model.Product;
import com.cts.pms.model.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService serv;
	
	@GetMapping("/")
	public String getProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "index";
		
	}
	
//	@RequestMapping(value="process.do",method=RequestMethod.POST)
//	public ModelAndView ProductPage(Model model,@ModelAttribute("product") Product product) {
//		ModelAndView modelAndView = new ModelAndView("success");
//		modelAndView.addObject("prodObj",product);
//		return modelAndView;
//	}
	
	@PostMapping("process.do")
	public ModelAndView ProductPage(@ModelAttribute("product") Product product) {
		String path=null;
		ModelAndView modelAndView = new ModelAndView();
		
		path="success";
		int pid = serv.addProduct(product);
		modelAndView.addObject("msg","Stored successfully with "+pid+" !!!");
		modelAndView.setViewName(path);
		return modelAndView;
	}

}
