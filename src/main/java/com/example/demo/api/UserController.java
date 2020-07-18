package com.example.demo.api;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.json.simple.JSONObject;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/user")
@RestController
public class UserController {
    
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user) {
        userService.addUser(user);
        JSONObject response = new JSONObject();   
        response.put("id",user.getId());
        return new ResponseEntity<JSONObject>(response,HttpStatus.CREATED);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}   