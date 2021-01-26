package com.springhb.springjpahibernateexample.repository;
import com.springhb.springjpahibernateexample.Model.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactRepository extends JpaRepository<UserContact, Integer> {
}
