package com.ecomm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.entity.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl {


	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addProduct(Product product)
	{
		try
		{
		sessionFactory.getCurrentSession().save(product);
		System.out.println("Product Inserted");
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Error Occured:"+e);
		return false;
		}
	}
	
	public List<Product> getAllProducts()
	{
		List<Product> listProducts=sessionFactory.openSession().createQuery("from Product").list();
		return listProducts;
	}
	
}