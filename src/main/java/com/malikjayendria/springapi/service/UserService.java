package com.malikjayendria.springapi.service;

import com.malikjayendria.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){

        userList = new ArrayList<>();

        User user1 = new User(1, "John", 24, "John@gmail.com");
        User user2 = new User(2, "Baim", 21, "Baim@gmail.com");
        User user3 = new User(3, "Jeff", 22, "Jeff@gmail.com");
        User user4 = new User(4, "Abdul", 21, "Abdul@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));

    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
