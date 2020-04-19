package com.proj.demoproje.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
//@RequestMapping("/api")
public class MainController {
    @RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
    //@GetMapping("/welcome/{name}")
    public ResponseEntity sayHi(@PathVariable("name") String name) {
        return new ResponseEntity("Hi " + name, HttpStatus.OK);

    }

}
