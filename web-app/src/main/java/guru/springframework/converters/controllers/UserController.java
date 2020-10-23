package guru.springframework.converters.controllers;


import guru.springframework.entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {

    User saveUser(UserCommand command){
        return  new User();
    }
}
