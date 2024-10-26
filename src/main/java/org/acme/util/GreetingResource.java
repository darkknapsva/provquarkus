package org.acme.util;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Path("/hello")
public class GreetingResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "{\"message\": \"HELLO THERE\"}";
    }


    @POST
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String sayHI(Map<String, String> message) {
        String receivedMessage = message.get("message");
        System.out.println("HELLO " + receivedMessage);
        return "HAHAH";
    }
}
