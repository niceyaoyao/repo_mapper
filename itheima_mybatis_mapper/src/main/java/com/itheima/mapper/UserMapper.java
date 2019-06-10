package com.itheima.mapper;

import com.itheima.domain.User;
import com.itheima.domain.User2;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public List<User> findByCondition(User user);

    public List<User> findByIds(List<Integer> ids);

    public List<User2> findByIds2(User2 user2);

    public void callProcedure(Map map);
    public void callFunction(Map map);
}
