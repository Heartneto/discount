package com.project.discount.model.exception;

/**
 *  Handle functional error and throw exception
 */

public class FunctionalException extends Exception {
    /**
     *  Constructor
     * @param pMessage
     */
    public FunctionalException(String pMessage){
        super(pMessage);
    }

    /**
     * Constructor
     * @param pMessage
     * @param pCause
     */
    public FunctionalException(String pMessage, Throwable pCause){
        super(pMessage, pCause);
    }
}
