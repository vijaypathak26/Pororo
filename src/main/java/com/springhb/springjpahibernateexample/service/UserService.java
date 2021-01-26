package com.springhb.springjpahibernateexample.service;

import com.springhb.springjpahibernateexample.Model.Users;
import com.springhb.springjpahibernateexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<Users> getAllUser() {
        return userRepository.findAll();

    }


    public List<Users> findUserDetail(String name){
        Optional<List<Users>> listOptional = userRepository.findByName(name);
       List<Users> listUsr = listOptional.orElse(new ArrayList<>());
      // List<Users> listUsr= listOptional.orElseThrow(() -> new RuntimeException("No Name Found"));
       return listUsr;
    }

}
