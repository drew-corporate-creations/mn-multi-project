package com.example.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import com.example.client.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SomeController {

    @Inject ClientExample client;

    @Get("/invoke")
    Map<String, String> invoke() {
        return client.doGet();
    }

    @Get("/")
    Map<String, String> getRequest() {
        Map<String, String> result = new HashMap<>();
        result.put("Get", "Success");
        return result;
    }
}
