package com.dod.DodWeb.UserController;

import com.dod.DodData.model.User;
import com.dod.DodData.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String greeting() {
        User user = userRepository.findByUserId("1");
        userRepository.findAll();
        return "holi";
    }
}
