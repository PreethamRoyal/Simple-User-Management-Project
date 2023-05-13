package net.javaguides.UserManagemnt.controller;

import lombok.AllArgsConstructor;
import net.javaguides.UserManagemnt.entity.User;
import net.javaguides.UserManagemnt.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    //Build User CREATE REST API

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
       User savedUser= userService.createUser(user);
       return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    //Build GET USER BY ID REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId){
        User getUser=userService.getUser(userId);
        return new ResponseEntity<>(getUser,HttpStatus.OK);
    }

    //Build GET ALL USERS TEST API

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users=userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    //Build Update USER REST API

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,@RequestBody User user){
        user.setId(userId);
        User updatedUser=userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User Successfully deleted!",HttpStatus.OK);
    }
}
