package com.springhb.springjpahibernateexample.Model;



import javax.persistence.*;

@Entity
public class UserContact {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "id",referencedColumnName = "id")
  private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UserContact(Integer id, Integer phoneNumber) {
        id = id;
        this.phoneNumber = phoneNumber;
    }

    public UserContact() {
    }

    public Integer getId() {
        return id;
    }

    public UserContact setId(Integer id) {
        id = id;
        return this;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public UserContact setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
