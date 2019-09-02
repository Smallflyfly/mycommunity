package com.examplespringboot.mapper;

import com.examplespringboot.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-09-02 09:32
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(account_id, username, token, gmt_create, gmt_modified) values(#{accountId}, " +
            "#{username}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insertUser(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
