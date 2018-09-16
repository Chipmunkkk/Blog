package xin.shaozb.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.shaozb.blog.model.Article;
import xin.shaozb.blog.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    private Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @RequestMapping("/{id}")
    public String fetchArticle(@PathVariable(value = "id") int id) {
        Article article = articleService.selectArticleById(id);
        return article.toString();
    }

    @RequestMapping("/archive")
    public String fetchArticles() {
        return "fetchArticles";
    }

    @RequestMapping("/archive/{date}")
    public String fetchArticleByTime(@PathVariable(value = "date") String date) {
        return date;
    }

    @RequestMapping("/tag")
    public String fetchTags() {
        return "fetchTags";
    }

}
