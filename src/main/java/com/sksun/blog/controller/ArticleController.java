package com.sksun.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sksun.blog.entity.ArticleEntity;
import com.sksun.blog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("articles")
public class ArticleController {
    final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/getArticle")
    public ArticleEntity getArticle(Integer id){
        log.info("查询文章id为" + id);
        ArticleEntity article = articleService.findArticleById(id);
        log.info("查询结果为 "+ article);
        return article;
    }

    @RequestMapping("/getArticles")
    public IPage<ArticleEntity> getArticles(@RequestParam("page") Integer page,
                                            @RequestParam(name="pageSize", required = false, defaultValue = "10") Integer pageSize){
        log.info("查询第{}页数据, 单页共{}条", page, pageSize);
        return articleService.getArticleList(new Page<>(page, pageSize));
    }
}
