package tn.esprit.clubconnect.services;


import tn.esprit.clubconnect.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserServices {
        List<User> getAllUsers();

        Optional<User> getUserById(int id);

        User createUser(User user);

        User updateUser(int id, User userDetails);

        void deleteUser(int id);
    }


