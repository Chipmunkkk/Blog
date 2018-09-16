package xin.shaozb.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.shaozb.blog.mapper.ArticleMapper;
import xin.shaozb.blog.model.Article;

import java.util.List;

@Service
public class ArticleService {

    private static int NUM_OF_PAGE = 10;

    @Autowired
    private ArticleMapper articleMapper;

    public Article selectArticleById(int id) {
        return articleMapper.selectArticleById(id);
    }

    public List<Article> selectArticleList(int page) {
        return articleMapper.selectArticleList(page - 1, NUM_OF_PAGE);
    }

}
