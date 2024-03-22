package tn.esprit.clubconnect.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.clubconnect.entities.User;
import tn.esprit.clubconnect.services.UserServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
    public class UserController {

        @Autowired
        private UserServices userService;

        @GetMapping
        public ResponseEntity<List<User>> getAllUsers() {
            List<User> users = userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
            Optional<User> user = userService.getUserById(id);
            return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @PostMapping("addUser")
        public ResponseEntity<User> createUser(@RequestBody User user) {
            User createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User userDetails) {
            User updatedUser = userService.updateUser(id, userDetails);
            return updatedUser != null ? new ResponseEntity<>(updatedUser, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
