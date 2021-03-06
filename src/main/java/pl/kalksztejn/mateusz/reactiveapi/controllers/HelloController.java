package pl.kalksztejn.mateusz.reactiveapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {



    @GetMapping("/")
    Mono<String> hello(){
        return  Mono.just("hello");
    }
}
