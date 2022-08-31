package com.example.employee.domen;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String about;
    private String email;
    @Column(name = "user_name")
    private String userName;
    private String password;
}
