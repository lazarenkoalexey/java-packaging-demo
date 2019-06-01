package com.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.joda.time.LocalDate;

@Path("/greeting")
@Produces("text/html")
public class HelloEndpoint {

    @GET
    public String hello() {
        String type = "Java EE/WildFly Thin WAR";
        if (System.getProperty("swarm.bundled.dependencies") != null) {
            type = "WildFly Swarm Fat JAR";
        }
        return "hello from " + type + ", the date is " + LocalDate.now().toString();
    }

}
