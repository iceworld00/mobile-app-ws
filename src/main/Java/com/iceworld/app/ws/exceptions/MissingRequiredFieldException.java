/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.exceptions;

/**
 *
 * @author ECONSTANTINE
 */
public class MissingRequiredFieldException extends RuntimeException{
   private static final long serialVersionUID = 5776681206288518465L;
   
   public MissingRequiredFieldException(String message){
    super(message);
   }
           
    
}
