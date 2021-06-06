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
}
