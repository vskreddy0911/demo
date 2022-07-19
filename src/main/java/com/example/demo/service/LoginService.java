package com.example.demo.service;

import com.example.demo.model.Login;

import java.util.List;
import java.util.Optional;

public interface LoginService {
   Login saveLogindetails( Login login);
   Optional<Login> FindByID( Long id);
   List<Login> getalldetails();

   Login updateLogin(Login login,Long id);

}
