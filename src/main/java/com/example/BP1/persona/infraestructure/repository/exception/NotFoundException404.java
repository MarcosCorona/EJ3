package com.example.BP1.persona.infraestructure.repository.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException404 extends RuntimeException{
    public NotFoundException404(String message) {
        super(message);
    }
}
