package com.bbs1.controller;

import com.bbs1.pojo.Post;
import com.bbs1.pojo.Result;
import com.bbs1.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostController {
    @Autowired
    private PostService postService;

    //发帖
    @PostMapping
    public Result post(@RequestBody Post post){
        log.info("发布帖子：{}",post);
        postService.post(post);
        return Result.success();
    }
}
