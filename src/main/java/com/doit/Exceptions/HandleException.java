package com.doit.Exceptions;

/**
 * Created by sampa on 25-07-2016.
 */
public class HandleException extends RuntimeException {
    public HandleException(String message,Exception e){
        super(message,e);
        this.setStackTrace(e.getStackTrace());
    }
    public  HandleException(){
         super.getMessage();
    }
}
