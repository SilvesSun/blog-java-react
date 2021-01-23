package com.sksun.controller;

import com.sksun.entity.Article;
import com.sksun.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/getArticle")
    public Article getArticle(Integer articleId){
        Article article = articleService.getById(articleId);
        return article;
    };
}
