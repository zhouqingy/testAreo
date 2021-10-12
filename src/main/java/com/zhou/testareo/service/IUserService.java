package com.zhou.testareo.service;

import com.zhou.testareo.pojo.tbl_users;

import java.util.List;

public interface IUserService {
    //查询全部
    public List<tbl_users> queryUserList();
    //查询id
    public tbl_users queryUserById(String UserID);
    //增加
    int addUser(tbl_users users);
    //更新
    int updateUser(tbl_users users);
    //删除
    int deleteUser(String id);
}
