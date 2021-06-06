package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IEFTAdressbuchRestWSExceptionModel {
	String type;
	String title;
	String status;
	String detail;
	String instance;
}
