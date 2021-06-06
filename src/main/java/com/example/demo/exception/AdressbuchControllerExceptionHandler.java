package com.example.demo.exception;

import com.example.demo.model.IEFTAdressbuchRestWSExceptionModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class AdressbuchControllerExceptionHandler {
    public static final String ERROR_CODE_URI = "/help/errorCodes/";

    @ExceptionHandler(value = {AdressbuchEntryNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(Exception e, WebRequest request) {
        final IEFTAdressbuchRestWSExceptionModel error = IEFTAdressbuchRestWSExceptionModel.builder()
				.type(ERROR_CODE_URI + AdressbuchEntryNotFoundException.CODE)
				.title(e.getMessage())
				.status(Integer.toString(HttpStatus.NOT_FOUND.value()))
				.detail("There is no addressbuch entry with the given name, please try again with another parameter")
				.instance(((ServletWebRequest)request).getRequest().getRequestURI())
				.build();

        return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
}
