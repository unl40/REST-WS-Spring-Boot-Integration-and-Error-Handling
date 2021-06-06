package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AdressbuchEntryNotFoundException extends RuntimeException {
    public static final String CODE = "1000";

    public AdressbuchEntryNotFoundException() {
        super("No adressbuch entry is found");
    }
}
