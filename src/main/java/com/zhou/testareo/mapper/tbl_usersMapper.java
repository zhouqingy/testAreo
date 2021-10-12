package com.zhou.testareo.mapper;

import com.zhou.testareo.pojo.tbl_users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface tbl_usersMapper {
    @Select("select * from tbl_users")
    List<tbl_users> queryUserList();
    @Select("select * from tbl_users where id=#{id}")
    tbl_users queryUserById(String UserID);
    @Insert( {"insert into tbl_users(UserID,UserPass,Remark1,type) values(#{UserID}, #{UserPass}, #{Remark1}, #{type})"})
    int addUser(tbl_users users);
    @Update("update tbl_users set UserPass=#{UserPass},Remark1=#{Remark1},type=#{type} where UserID=#{UserID}")
    int updateUser(tbl_users users);
    @Delete("delete from tbl_users where UserID=#{UserID}")
    int deleteUser(String id);
}
