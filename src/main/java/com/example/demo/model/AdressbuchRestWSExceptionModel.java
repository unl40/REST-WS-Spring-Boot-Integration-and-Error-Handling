package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AdressbuchRestWSExceptionModel {
	String error;
	String message;
	String detail;
	String url;

}
