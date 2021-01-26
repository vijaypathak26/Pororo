package com.springhb.springjpahibernateexample.repository;

import com.springhb.springjpahibernateexample.Model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {


    Optional<List<Users>> findByName(String name);
}
