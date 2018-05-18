package com.xmu.aiad.service;

import com.xmu.aiad.model.User;

public interface IUserService {

    public User getUserById(int id);

    boolean updateUser(User user);

    boolean addUser(long telephone, String password);

    public int selectUserByTelephone(long telephone);

    public User getUserByTelephone(long telephone);
}
