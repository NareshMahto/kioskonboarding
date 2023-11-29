package com.csp.onboard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csp.onboard.repository.LoginRepository;

@Service
public class LoginSetviceImpl implements LoginService{
	
	private LoginRepository loginRepository;
	
	@Autowired
    public LoginSetviceImpl(LoginRepository theLoginRepository) {
        loginRepository = theLoginRepository;
    }

}
