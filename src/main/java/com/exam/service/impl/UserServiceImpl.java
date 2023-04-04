package com.exam.service.impl;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;


import java.util.Set;

public class UserServiceImpl implements UserService {

    private RoleRepository roleRepository;

    private UserRepository userRepository;

    @Override
    public User createUser(User user, Set<Role> roles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
        if(local != null) {
            System.out.println("User is already there !!");
            throw new Exception("User already present !!");
        } else {
            for(Role r : roles) {
                roleRepository.save(r);
            }

            user.getRoles().addAll(roles);
            local = this.userRepository.save(user);
        }

        return local;
    }
}
