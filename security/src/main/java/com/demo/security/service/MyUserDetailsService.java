package com.demo.security.service;

import com.demo.security.Repo.UserRepo;
import com.demo.security.model.User;
import com.demo.security.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByname(username);
        if(user == null) {
            System.out.println("User not founds");
            throw new UsernameNotFoundException("username not found");
        }
        return new UserPrincipal(user);
    }
}
