package com.huawei.codearts.controller;

import com.huawei.codearts.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.huawei.codearts.service.interfaces.IUsersService;

/**
 * @author Luis Enrique Carranza - Huawei Cloud
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class ApiController {

    @Autowired
    private IUsersService usersService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok(this.usersService.findAll());
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Object> saverUser(@RequestBody UserRequest request){
        this.usersService.save(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}

