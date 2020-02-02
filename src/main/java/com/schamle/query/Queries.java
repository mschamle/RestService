package com.schamle.query;

import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path ("query")
@Produces(MediaType.APPLICATION_JSON)
public class Queries {
    @Inject
    private Logger logger;

    @GET
    public String get() {
        return "Hello";
    }
}
