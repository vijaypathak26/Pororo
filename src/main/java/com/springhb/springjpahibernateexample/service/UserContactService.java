package com.springhb.springjpahibernateexample.service;

import com.springhb.springjpahibernateexample.Model.UserContact;
import com.springhb.springjpahibernateexample.Model.Users;
import com.springhb.springjpahibernateexample.repository.UserContactRepository;
import com.springhb.springjpahibernateexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserContactService {

    @Autowired
    UserContactRepository userContactRepository;

    public List<UserContact> getAllContactDetails() {
        return userContactRepository.findAll();
    }


    public List<UserContact> updateAll(String name) {
        UserContact userContact = new UserContact();
        Users user = new Users();
        user.setTeamName("American Developer")
                .setSalary(10000)
                .setName(name);
        userContact.setPhoneNumber(347934739)
        .setUsers(user);

        userContactRepository.save(userContact);
        return userContactRepository.findAll();
    }

}
