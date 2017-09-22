package ie.cit.soft8027.exampledb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.soft8027.exampledb.dao.ProductDao;
import ie.cit.soft8027.exampledb.domain.Product;

public class App {

	private static ApplicationContext context;
	
	public static void main (String args[]){
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		ProductDao productDao = context.getBean(ProductDao.class);
		
		Product oldXboxOne = productDao.getById(1);
		
		System.out.println(oldXboxOne.toString());
		
		List<Product> products = productDao.findAll();
		System.out.println("I found " + products.size() + " products.");
		
	}
}
