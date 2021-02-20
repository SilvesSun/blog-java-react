package com.sksun.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sksun.blog.entity.ArticleEntity;
import com.sksun.blog.mapper.ArticleMapper;
import com.sksun.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public ArticleEntity findArticleById(int id) {
        return articleMapper.findArticleById(id);
    }

    @Override
    public Page<ArticleEntity> getArticleList(Page<ArticleEntity> page) {
//        Wrapper<ArticleEntity> wrapper = new QueryWrapper<ArticleEntity>().gt("id", 0).orderByDesc("id");
        return articleMapper.selectPage(page, null);
    }
}
