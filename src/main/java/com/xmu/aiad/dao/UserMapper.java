package com.xmu.aiad.dao;

import com.xmu.aiad.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getUserByTelephoneAndPassword(long telephone, String password);

    int updateByTelephone(User record);

    Integer selectUserByTelephone(long telephone);

    User getUserByTelephone(long telephone);
}