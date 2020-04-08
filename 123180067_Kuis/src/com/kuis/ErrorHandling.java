package com.kuis;

// membuat error handling
public class ErrorHandling extends Throwable {
    // deklarasi vaiabel
    private String exception;

    // bikin constructor
    public ErrorHandling(String e) {
        super();
        this.exception = e;
    }

    // method getMessage error handling exception
    public String getMessage(){
        return this.exception;
    }
}
