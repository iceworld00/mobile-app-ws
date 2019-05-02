/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.ui.model.response;

/**
 *
 * @author ECONSTANTINE
 */
public enum ErrorMessages {
    
    MISSING_REQUIRED_FIELDS("Mising required field. Please check documentation for required fields"),
    RECORD_ALREADY_EXISTS("Record already exists");

    private String errorMessage;
    
    ErrorMessages(String errorMessage){
        this.errorMessage=errorMessage;
    }
    


    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}