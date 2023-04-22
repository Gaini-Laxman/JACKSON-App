package com.klinnovations.binding;

import lombok.Data;

@Data	
public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	private Integer phno;
	
	private Address addr;
	
}
