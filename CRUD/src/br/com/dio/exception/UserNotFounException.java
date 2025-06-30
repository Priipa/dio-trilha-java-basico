package br.com.dio.exception;

public class UserNotFounException extends RuntimeException{

    public UserNotFounException(String message) {
        super(message);
    }
}