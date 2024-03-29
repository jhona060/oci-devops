package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class HelloController {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public String index() {
        return "With Love from OCI Devops - Powered by Oracle GraalVM!";
    }

    @Get ("/{name}")
    @Produces(MediaType.TEXT_PLAIN) 
    public String index(String name) {
        return "Hello " + name; 
    }
}