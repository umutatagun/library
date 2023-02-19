package com.kitaplik.libraryservice.exception;

public class BookNotFoundException extends RuntimeException {
    private ExceptionMessage exceptionMessage;

    public BookNotFoundException(String message, ExceptionMessage exceptionMessage) {
        super(message);
        this.exceptionMessage = exceptionMessage;
    }

    public BookNotFoundException(String s) {
        super(s);
    }

    public ExceptionMessage getExceptionMessage() {
        return exceptionMessage;
    }

    public BookNotFoundException(ExceptionMessage message) {
        this.exceptionMessage = message;
    }
}