package com.zhou.testareo.service.impl;

import com.zhou.testareo.mapper.tbl_usersMapper;
import com.zhou.testareo.pojo.tbl_users;
import com.zhou.testareo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {

        @Autowired
        private tbl_usersMapper userMapper;
        @Override
        public List<tbl_users> queryUserList(){
            return userMapper.queryUserList();
        }
        @Override
        public tbl_users queryUserById(String UserID){
            return userMapper.queryUserById(UserID);
        }

        @Override
        public int addUser(tbl_users users){
            return userMapper.addUser(users);
        }

        @Override
        public int updateUser(tbl_users users){
            return userMapper.updateUser(users);
        }

        @Override
        public int deleteUser(String id){
            return userMapper.deleteUser(id);
        }

}
