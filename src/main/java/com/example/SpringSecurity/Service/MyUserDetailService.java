package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Model.MyUserDetailModel;
import com.example.SpringSecurity.Model.User;
import com.example.SpringSecurity.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUsername(username);
        user.orElseThrow(
                ()-> new UsernameNotFoundException("User not found")
        );
//        return user.map(MyUserDetailModel::new).get();
        return new MyUserDetailModel(user.get());
    }
}
