package com.chenlie.redistest.service.impl;

import com.chenlie.redistest.dao.UserMapper;
import com.chenlie.redistest.pojo.Users;
import com.chenlie.redistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> getAll() {
        List<Users> list = userMapper.getAll();
        return list;
    }
}
