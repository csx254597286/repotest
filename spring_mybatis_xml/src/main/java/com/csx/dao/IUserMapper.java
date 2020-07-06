package com.csx.dao;

import com.csx.entity.User;

import java.util.List;

public interface IUserMapper {

    List<User> selectAllUser();

}
