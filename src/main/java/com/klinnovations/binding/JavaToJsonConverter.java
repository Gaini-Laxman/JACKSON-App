package com.klinnovations.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class JavaToJsonConverter {
	
	public static void main(String[] args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		
		Customer c =new Customer();
		c.setId(101);
		c.setName("Laxman");
		c.setEmail("laxman@gmail.com");
		c.setPhno(911039988);
		c.setAddr(addr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file created");
	}
	
	
	

}
