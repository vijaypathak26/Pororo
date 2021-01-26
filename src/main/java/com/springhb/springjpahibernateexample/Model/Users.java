package com.springhb.springjpahibernateexample.Model;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name="users", catalog = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name="name")
    private String name ;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "Salary")
    private Integer salary;


    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Users setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Users setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }


}
