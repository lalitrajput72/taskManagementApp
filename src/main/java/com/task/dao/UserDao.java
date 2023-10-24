package com.task.dao;

import com.task.entity.Role;
import com.task.entity.User;
import com.task.repository.RoleRepository;
import com.task.repository.UserRepository;
import com.task.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    public List<User> findAllUser() {
       List<User> users = userRepository.findAll();
       return users;
    }

    public Optional<User> findUserById(Integer userId) {
        Optional<User> user = userRepository.findById(userId);
        return user;
    }

    public User createUser(User user) {
        User u = userRepository.save(user);
        return u;
    }

    public List<Role> findAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles;
    }

    public Optional<Role> findRoleById(Integer roleId) {
        Optional<Role> role = roleRepository.findById(roleId);
        return role;
    }

    public Role createRole(Role role) {
        Role r = roleRepository.save(role);
        return r;
    }

}
