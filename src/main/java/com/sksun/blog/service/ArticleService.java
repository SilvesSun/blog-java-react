package com.sksun.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sksun.blog.entity.ArticleEntity;

public interface ArticleService extends IService<ArticleEntity> {
    ArticleEntity findArticleById(int id);
    IPage<ArticleEntity> getArticleList(Page<ArticleEntity> page);
}
