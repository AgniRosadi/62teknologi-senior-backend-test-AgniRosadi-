package com.restapi.restapi.controller;

import com.restapi.restapi.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.restapi.restapi.model.UserModel;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Controller()
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    ///request body row
    @GetMapping(value = "/api/user/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserModel>> registerUser() {
        try {
            List<UserModel> model = userRepository.findAll();
            if (model.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(model, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    ///request body form-data
    @GetMapping(value = "/api/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<UserModel>> getIdUsers(@PathVariable("id") BigInteger id) {
        Optional<UserModel> mol = userRepository.findById(id);
        return ResponseEntity.ok(mol);
    }

    @PostMapping(value = "/api/user/delete/", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteIdUsers(@RequestBody UserModel model) {
        try {
            System.out.println("somo");
            userRepository.deleteById(model.getId());
        } catch (Exception e) {
            System.out.println("salah");
        }
    }

    ///request body form-data
    @PostMapping(value = "/api/user/add/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserModel> addUsers(@ModelAttribute UserModel model) {
        try {
            userRepository.save(model);
            return new ResponseEntity<>(model, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
