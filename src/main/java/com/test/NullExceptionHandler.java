package com.test;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by synycs on 13/9/16.
 */
@Provider
public class NullExceptionHandler implements ExceptionMapper<NullPointerException> {
    @Override
    public Response toResponse(NullPointerException e) {
        return Response.accepted(new User("dd","fff")).build();
    }
}
