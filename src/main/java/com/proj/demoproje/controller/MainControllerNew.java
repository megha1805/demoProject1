package com.proj.demoproje.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
//@RequestMapping("/api")
public class MainControllerNew {
    @RequestMapping(value = "/welcome/{name}", method = RequestMethod.POST)
    //@GetMapping("/welcome/{name}")
    public ResponseEntity sayHi(@PathVariable("name") String name, @RequestBody String abc) {
        return new ResponseEntity("Hi " + name + abc, HttpStatus.OK);

    }

}
