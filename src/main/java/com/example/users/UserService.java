package com.example.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository = new UserRepositoryImp();

    public User getById(int id) {
        return userRepository.getById(id);
    }
}
