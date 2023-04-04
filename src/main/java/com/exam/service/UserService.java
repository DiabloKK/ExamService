package com.exam.service;

import com.exam.models.Role;
import com.exam.models.User;

import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<Role> roles) throws Exception;
}
