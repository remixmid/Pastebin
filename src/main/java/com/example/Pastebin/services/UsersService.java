package com.example.Pastebin.services;

import com.example.Pastebin.models.User;
import com.example.Pastebin.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> findAllUsers() {
        return usersRepository.findAll();
    }

    public User findOneUser(int userId) {
        Optional<User> foundPerson = usersRepository.findById(userId);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void saveUser(User user) {
        usersRepository.save(user);
    }

    @Transactional
    public void updateUser(int userId, User updatedUser) {
        updatedUser.setUserId(userId);
        usersRepository.save(updatedUser);
    }

    @Transactional
    public void deleteUser(int userId) {
        usersRepository.deleteById(userId);
    }
}
