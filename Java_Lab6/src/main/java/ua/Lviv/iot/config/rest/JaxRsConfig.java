package ua.Lviv.iot.config.rest;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
public class JaxRsConfig extends Application{
    {
        System.out.println("Here");
    }
}