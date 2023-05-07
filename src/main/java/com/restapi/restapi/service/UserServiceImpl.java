package com.restapi.restapi.service;

import com.restapi.restapi.model.UserModel;
import com.restapi.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl {
    @Autowired
    UserRepository userRepository;


//    public String getUser(List<UserModel> model) throws Exception {
//         model = userRepository.getUser();
//         return String.valueOf(model);
//    }
//
////    @Override
//    public String findUser(UserModel model) throws Exception {
//        model = userRepository.findUser(model.getId());
//        return String.valueOf(model);
//    }
//
////    @Override
//    public String deleteUser(UserModel model) throws Exception {
//        userRepository.deleteUser(model.getId());
//        return String.valueOf(model);
//    }
//
////    @Override
//    public String addUser(UserModel model) throws Exception {
//        userRepository.addUser(model.getName(), model.getAge());
//        return String.valueOf(model);
//    }


}
