package com.user.service;

import com.user.domain.User;
import com.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User u) {
        return userRepository.save(u);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(long id){
        return userRepository.findById(id).orElseThrow();

    }

    public void delete(long id){
        userRepository.delete(findById(id));
    }

}
