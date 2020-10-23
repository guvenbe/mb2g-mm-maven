package guru.springframework.converters.controllers;


import guru.springframework.entities.User;
import guru.springframework.domain.UserCommand;
import guru.springframework.converters.UserMapper;

public class UserController {

    User saveUser(UserCommand command){
        return  UserMapper.INSTANCE.userCommandToUser(command);
    }
}
