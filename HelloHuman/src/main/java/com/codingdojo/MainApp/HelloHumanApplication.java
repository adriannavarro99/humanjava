package com.codingdojo.MainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.codingdojo.models.*;


@SpringBootApplication
@RestController
public class HelloHumanApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping( "/" )
	public String Human() {
		
		String defaultMessage= "<h1>Hello Human!<h1>" + 
				"<h2>Welcome to Springboot</h2>";
		return defaultMessage;
		
	}
	
	@RequestMapping( value = "/{name}/{lastName}", method = RequestMethod.GET )
	public String getUserByNamePath( @PathVariable( "name" ) String name,@PathVariable ("lastName")String lastName) {
		
			User user1=new User(name,lastName);
			
			if( name.equals(user1.getname()) &&lastName.equals(user1.getlastName())) {
			
				return "<a href=/>Go Back</a>"
						+ "<h1> Hello " + user1.getname() +" "+ user1.getlastName() </h1>"
						
			}else {
			
				return "<h1>Does not exist</h1>";
		}
		
	}

}
