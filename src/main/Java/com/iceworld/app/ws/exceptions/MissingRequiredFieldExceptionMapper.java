/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.exceptions;

import com.iceworld.app.ws.ui.model.response.ErrorMessage;
import com.iceworld.app.ws.ui.model.response.ErrorMessages;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author ECONSTANTINE
 */
@Provider
public class MissingRequiredFieldExceptionMapper implements ExceptionMapper <MissingRequiredFieldException> {

    @Override
    public Response toResponse(MissingRequiredFieldException exception) {
        
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 
                ErrorMessages.MISSING_REQUIRED_FIELDS.name(), "http://iceworld.com");
                
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
    
}
