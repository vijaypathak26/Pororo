package com.springhb.springjpahibernateexample.controller;

import com.springhb.springjpahibernateexample.Model.UserContact;
import com.springhb.springjpahibernateexample.Model.Users;
import com.springhb.springjpahibernateexample.repository.UserContactRepository;
import com.springhb.springjpahibernateexample.service.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userContact")
public class UserContactController {

    @Autowired
    UserContactService userContactService;

    @GetMapping(value="/all")
    public List<UserContact> findAllContact(){
                       return userContactService.getAllContactDetails();

    }

    @GetMapping(value="/update/{name}")
    public List<UserContact> updateContactInformation(@PathVariable final String name){
       return userContactService.updateAll(name);

    }

}
