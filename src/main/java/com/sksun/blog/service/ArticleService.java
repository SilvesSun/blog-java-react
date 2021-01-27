package com.sksun.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sksun.blog.entity.ArticleEntity;

import java.util.List;
import java.util.Map;

public interface ArticleService extends IService<ArticleEntity> {
    ArticleEntity findArticleById(int id);
}
