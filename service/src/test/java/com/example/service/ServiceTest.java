package com.example.service;

import com.example.client.ClientExample;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class ServiceTest {

    @Inject ClientExample client;

    @Test
    void testClient() {

        client.doGet();
        /*
        Message: Multiple possible bean candidates found: [io.micronaut.aop.InterceptorRegistry, io.micronaut.aop.InterceptorRegistry, io.micronaut.aop.InterceptorRegistry, io.micronaut.aop.InterceptorRegistry]
Path Taken: ServiceTest.client
io.micronaut.context.exceptions.BeanInstantiationException: Error instantiating bean of type  [com.example.service.ServiceTest]
         */
    }

}
