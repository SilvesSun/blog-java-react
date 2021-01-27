package com.sksun.blog.controller;

import com.sksun.blog.entity.ArticleEntity;
import com.sksun.blog.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {
    final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/getArticle")
    public ArticleEntity getArticle(Integer id){
        System.out.println(id);
        ArticleEntity article = articleService.findArticleById(id);
        System.out.println(article);
        return article;
    }
}
