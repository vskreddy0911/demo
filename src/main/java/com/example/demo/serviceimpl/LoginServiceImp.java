package com.example.demo.serviceimpl;


import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImp implements LoginService {

   private LoginRepository loginRepository;

    public LoginServiceImp( LoginRepository loginRepository ) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Login saveLogindetails( Login login ) {
        return loginRepository.save(login);
    }

    @Override
    public Optional<Login> FindByID( Long id ) {
        return loginRepository.findById(id);
    }

    @Override
    public List<Login> getalldetails() {
        return loginRepository.findAll();
    }

    @Override
    public Login updateLogin( Login login, Long id ) {
        Login login1=loginRepository.findById(id).get();
        login1.setId(login.getId());
        login1.setFirstName(login.getFirstName());
        login1.setLastName(login.getLastName());
        login1.setEmail(login.getEmail());
        login1.setPhoneNumber(login.getPhoneNumber());
        return login1;

    }


}
