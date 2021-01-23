package com.sksun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sksun.entity.Article;
import com.sksun.mapper.ArticleMapper;
import com.sksun.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
