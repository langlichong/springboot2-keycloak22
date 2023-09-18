package com.genew.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/foos")
public class FooController {


    @GetMapping(value = "/{id}")
    public ResponseEntity findOne(@PathVariable Long id) {

        return ResponseEntity.ok("You get one foo !");
    }

    @GetMapping
    public ResponseEntity findAll() {

        return ResponseEntity.ok("ALl foos  you got .");
    }


}