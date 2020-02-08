package com.schamle.query;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path ("query")
//@Produces(MediaType.APPLICATION_JSON)
@NoArgsConstructor
@Slf4j
public class Queries {
    @GET
    public String get() {
        log.info ("Called get()");
        return "Hello";
    }
}
