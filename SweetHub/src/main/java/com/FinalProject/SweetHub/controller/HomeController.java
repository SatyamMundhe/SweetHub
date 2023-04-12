package com.FinalProject.SweetHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.FinalProject.SweetHub.global.GlobalData;
import com.FinalProject.SweetHub.service.CategoryService;
import com.FinalProject.SweetHub.service.ProductService;
import com.FinalProject.SweetHub.service.UserdetService;

@Controller
public class HomeController {

	@Autowired
	CategoryService  categoryService;
	@Autowired
	ProductService  productService;
	@Autowired
	UserdetService  userdetService;
	
	@GetMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("categories",categoryService.getAllCategory());
		model.addAttribute("products",productService.getAllProduct());
		model.addAttribute( "cartCount", GlobalData.cart.size());
		return "shop";
	}
	@GetMapping("/shop/category/{id}")
	public String shopByCategory(Model model,@PathVariable int  id) {
		model.addAttribute("categories",categoryService.getAllCategory());
		model.addAttribute("products",productService.getAllProductsByCategoryId(id));
		model.addAttribute( "cartCount", GlobalData.cart.size());
		return "shop";
	}
	@GetMapping("/shop/viewproduct/{id}")
	public String vieusernameforclasswProduct(Model model,@PathVariable int  id) {
		model.addAttribute("product",productService.getProductById(id).get());
		model.addAttribute( "cartCount", GlobalData.cart.size());
		return "viewProduct";
	}
	@GetMapping("/contact")
	public String contact(Model model ) {
		return("contact");
	}
	
}
