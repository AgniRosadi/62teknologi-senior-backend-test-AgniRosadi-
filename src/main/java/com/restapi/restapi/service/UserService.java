package com.restapi.restapi.service;
import com.restapi.restapi.model.UserModel;

import java.util.List;

public interface UserService {
    String getUser(List<UserModel> model) throws Exception;

    String findUser(UserModel model) throws Exception;

    String deleteUser(UserModel model) throws  Exception;

    String addUser(UserModel model) throws  Exception;
}
