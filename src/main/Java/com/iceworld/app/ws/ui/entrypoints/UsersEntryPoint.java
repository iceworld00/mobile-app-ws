/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iceworld.app.ws.ui.entrypoints;

import com.iceworld.app.ws.service.UsersService;
import com.iceworld.app.ws.service.impl.UsersServiceImpl;
import com.iceworld.app.ws.shared.dto.UserDTO;
import com.iceworld.app.ws.ui.model.request.CreateUserRequestModel;
import com.iceworld.app.ws.ui.model.response.UserProfileRest;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author ECONSTANTINE
 */
@Named
@Path("/")
public class UsersEntryPoint {
    
    @POST
    @Path("users")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();
        
        //Preparte UserDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);
        
        // Create new user
        UsersService userService = new UsersServiceImpl();
        UserDTO createdUserProfile = userService.createUser(userDto);
         
        //Prepare response
        BeanUtils.copyProperties(createdUserProfile, returnValue);
        
        return returnValue;
        
    }
    
    
}
