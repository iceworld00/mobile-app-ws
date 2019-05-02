/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.utils;

import com.iceworld.app.ws.shared.dto.UserDTO;
import com.iceworld.app.ws.ui.model.response.ErrorMessages;
import com.iceworld.app.ws.exceptions.MissingRequiredFieldException;

/**
 *
 * @author ECONSTANTINE
 */
public class UserProfileUtils {
 
public void validateRequiredFields(UserDTO userDto) throws MissingRequiredFieldException
{
if (
userDto.getFirstName() == null ||
userDto.getFirstName().isEmpty() ||
userDto.getLastName() == null ||
userDto.getLastName().isEmpty() ||
userDto.getEmail() == null ||
userDto.getEmail().isEmpty() ||
userDto.getPassword() == null ||
userDto.getPassword().isEmpty()
) {
throw new MissingRequiredFieldException(
	ErrorMessages.MISSING_REQUIRED_FIELDS.getErrorMessage());
}
}
    
}
