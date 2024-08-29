package com.bbs1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Integer id; //ID
    private String username; //用户名
    private String password; //密码
    private Short gender; //性别 , 1 男, 2 女
    private String image; //图像url
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
}
