/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.service.impl;

import com.iceworld.app.ws.service.UsersService;
import com.iceworld.app.ws.shared.dto.UserDTO;
import com.iceworld.app.ws.utils.UserProfileUtils;

/**
 *
 * @author ECONSTANTINE
 */
public class UsersServiceImpl extends UsersService {
    
    UserProfileUtils userProfileUtils = new UserProfileUtils();

    public UserDTO createUser(UserDTO user){
        UserDTO returnValue = new UserDTO();
        
        // validate the required fields
        
        // Check if user already exists
        
        // Create an Entity object
        
        // Generate secure public user id
        
        // Generate salt
        
        // Generate secure password
        
        // Record data into a database
        
        // Return back the user profile
        
        return returnValue;
    }
}
