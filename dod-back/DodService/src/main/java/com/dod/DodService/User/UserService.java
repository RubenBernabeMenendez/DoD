package com.dod.DodService.User;

import com.dod.DodData.model.User.User;

import java.util.List;

public interface UserService {

    User getUserbyUserId(Long userId);

    List<User> getAllUser();
}
