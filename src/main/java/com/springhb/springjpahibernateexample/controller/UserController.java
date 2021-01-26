package com.springhb.springjpahibernateexample.controller;

import com.springhb.springjpahibernateexample.Model.Users;
import com.springhb.springjpahibernateexample.repository.UserRepository;
import com.springhb.springjpahibernateexample.service.UserService;
import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/userC")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/allUser")
    public List<Users> getAll() {
        return userService.getAllUser();

    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Users>> findUserDetail(@PathVariable final String name){
        try{
        List<Users> lstUser= userService.findUserDetail(name);
        return new ResponseEntity<List<Users>>(lstUser, HttpStatus.OK);
    }

        catch (NoSuchElementException e){
            return  new ResponseEntity<List<Users>>(HttpStatus.NOT_FOUND);

        }
    }
}
