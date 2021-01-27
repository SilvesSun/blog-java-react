package com.sksun.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sksun.blog.entity.ArticleEntity;
import com.sksun.blog.mapper.ArticleMapper;
import com.sksun.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public ArticleEntity findArticleById(int id) {
        return articleMapper.findArticleById(id);
    }
}
