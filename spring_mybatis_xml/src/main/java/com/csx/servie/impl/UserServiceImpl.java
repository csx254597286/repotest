package com.csx.servie.impl;

import com.csx.dao.IUserMapper;
import com.csx.entity.User;
import com.csx.servie.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper userMapper = null;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
