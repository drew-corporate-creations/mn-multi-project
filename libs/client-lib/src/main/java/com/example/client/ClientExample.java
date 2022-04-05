package com.example.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.Map;

@Client(value = "http://127.0.0.1:8080")
public interface ClientExample {

    @Get
    Map<String, String> doGet();
}
