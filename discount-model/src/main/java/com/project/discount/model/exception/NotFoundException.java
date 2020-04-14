package com.project.discount.model.exception;

public class NotFoundException extends Exception {
    /**
     *  Default Constructor
     */
    public NotFoundException(){

    }

    /**
     *  Constructor
     * @param pMessage
     */
    public NotFoundException(String pMessage){
        super(pMessage);
    }

    /**
     * Constructor
     * @param pMessage
     * @param pCause
     */
    public NotFoundException(String pMessage, Throwable pCause){
        super(pMessage, pCause);
    }
}
