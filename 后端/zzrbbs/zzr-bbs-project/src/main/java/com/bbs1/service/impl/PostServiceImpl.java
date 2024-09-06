package com.bbs1.service.impl;

import com.bbs1.mapper.PostMapper;
import com.bbs1.pojo.Post;
import com.bbs1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public void post(Post post) {
        postMapper.post(post);
    }
}
