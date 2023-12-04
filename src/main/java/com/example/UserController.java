package com.example;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.HttpClient;
import io.micronaut.scheduling.annotation.Scheduled;
import io.micronaut.validation.Validated;
import io.micronaut.validation.annotation.ValidatedElement;
import jakarta.inject.Inject;
import jakarta.validation.Valid;

@Controller
public class UserController {

    @Inject
    private HttpClient httpClient;

    @Inject
    UserRepository userRepository;

    @Post
    public User create(@Valid  @Body User user) {
        return userRepository.save(user);
    }

    @Scheduled(initialDelay = "1s")
    public void test() {
        User user = httpClient.toBlocking().retrieve(
                HttpRequest.POST("http://127.0.0.1:8080/", new User(null, "test@example.com")),
                Argument.of(User.class)
        );
        System.out.println("Request succeeded");
    }

}