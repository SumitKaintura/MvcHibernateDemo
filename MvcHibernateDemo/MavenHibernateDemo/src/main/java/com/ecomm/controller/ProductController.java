package com.ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecomm.dao.ProductDAOImpl;
import com.ecomm.entity.Product;

@Controller
public class ProductController 
{
	@Autowired
	ProductDAOImpl productDAO;
	
	@RequestMapping("/product")
	public String showProductPage(Model m)
	{
		Product product=new Product();
		m.addAttribute("product", product);
		List<Product> productList=productDAO.getAllProducts();
		m.addAttribute("products", productList);
		return "Product";
	}
	
	@PostMapping("/ProductInsert")
	public String insertProduct(@ModelAttribute("product")Product product,Model m)
	{
		productDAO.addProduct(product);
		System.out.println("Added Product= Controller");
		
		List<Product> productList=productDAO.getAllProducts();
		m.addAttribute("products", productList);
		
		for(Product product1:productList)
		{
			System.out.println(product1.getProductName()+"::"+product1.getProductDesc());
		}
		
		return "Product";
	}
	
	
}
