package com.bbs1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    Integer id;//主键id
    Integer userId;//发帖用户id
    String content;//发帖内容
    Integer commentNum;//评论数量
    Integer repostNum;//转发数量
    Integer likeNum;//点赞数量
}
