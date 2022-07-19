package com.example.demo.controller;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;
import com.example.demo.serviceimpl.LoginServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;
import java.util.Optional;

@RestController
public class LoginController {

 private LoginServiceImp loginServiceImp;

    public LoginController( LoginServiceImp loginServiceImp ) {
        this.loginServiceImp = loginServiceImp;
    }

    @GetMapping("/getalldetails")
    public List<Login> allGet()
    {

        return ( loginServiceImp.getalldetails());
    }

    @PostMapping("/login")
    public ResponseEntity<Login> saveLogin(@RequestBody Login login)
    {
        return new ResponseEntity<Login>(loginServiceImp.saveLogindetails(login),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
   public Optional<Login> getByid( @PathVariable Long id)
    {
        return loginServiceImp.FindByID(id);
    }
    @PutMapping("/{id}")
    public Login updateLogin(@RequestBody Login login,@PathVariable  long id)
    {
            return loginServiceImp.updateLogin(login,id);


    }


}
