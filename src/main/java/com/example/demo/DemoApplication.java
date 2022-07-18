package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//Spring framework uses the concept of singleton design pattern (it will create only 1 object)
		// so if we don't write part (1), the previous line will implement an Alien class using the 
		// constructor, (and the message: "new object is made" will be displayed)
		
		//(1)
		Alien a = context.getBean( Alien.class);
		a.show();
		
		//(2)
		//Alien a2 = context.getBean( Alien.class);
		//a2.show();
		
		// the message will show only once (from part (1)); because only one instance will be made (Singleton)
		//unless we write @Scope(value="prototype") in the Alien Class
		// using the above, will not create an instance by default, and everytime we use getBean, it will create a new object

		
		
	}

}
