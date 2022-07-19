package com.example.demo.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Data
@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "email")
    String email;
    @Column(name = "phone_number")
    String phoneNumber;
}
