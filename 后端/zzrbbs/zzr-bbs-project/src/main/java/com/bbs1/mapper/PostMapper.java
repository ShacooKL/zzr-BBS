package com.bbs1.mapper;

import com.bbs1.pojo.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {

    @Insert("insert into zzr_bbs.post(user_id, content) values (#{userId},#{content})")
    void post(Post post);
}
