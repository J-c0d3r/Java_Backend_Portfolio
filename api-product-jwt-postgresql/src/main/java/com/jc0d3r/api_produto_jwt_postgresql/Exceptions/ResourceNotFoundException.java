package com.jc0d3r.api_produto_jwt_postgresql.Exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensage) {
        super(mensage);
    }

}
