package com.bbs1.mapper;

import com.bbs1.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {
    @Select("select * from zzr_bbs.users where username = #{username} and password = #{password}")
    Users getByUsernameAndPass(Users users);

    @Insert("insert into zzr_bbs.users(username, password, gender, image, create_time, update_time) values" +
            "(#{username},#{password},#{gender},#{image},#{createTime},#{updateTime}) ")
    void insertUser(Users users);
}
