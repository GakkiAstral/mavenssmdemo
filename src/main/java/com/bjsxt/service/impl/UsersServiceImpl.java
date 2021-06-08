package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> findUsersAll() {
        UsersExample example = new UsersExample();
        return this.usersMapper.selectByExample(example);
    }
}
