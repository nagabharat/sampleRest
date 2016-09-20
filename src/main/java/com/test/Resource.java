package com.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by synycs on 12/9/16.
 */

@Path("/test")
public class Resource {
    @Inject
    private User user;
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Response getUser(){
        throw new NullPointerException();
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)

    public User setUser(){
        return user;
    }
}
