package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AdressbuchEntry {
	private Long id;
	private String nameSurname;
	private String phoneNumber;

	public AdressbuchEntry() {
		throw new Error("Unresolved compilation problems: \n\tThe declared package \"com.example.demo.model\" does not match the expected package \"src.main.java.com.example.demo.model\"\n\tThe import lombok cannot be resolved\n\tThe import lombok cannot be resolved\n\tThe import lombok cannot be resolved\n\tData cannot be resolved to a type\n\tAllArgsConstructor cannot be resolved to a type\n\tBuilder cannot be resolved to a type\n\tImplicit super constructor Object() is undefined for default constructor. Must define an explicit constructor\n\tLong cannot be resolved to a type\n\tString cannot be resolved to a type\n\tString cannot be resolved to a type\n");
	}
}
