package com.example.mvc.dao;

import com.example.mvc.entity.Article;

import java.util.List;

public interface ArticleDao {
    Article save(Article article);
    List<Article> getAll();
    Article getById(Long id);
    void eraseAll();
    void eraseArticle(Article article);
    List<Article> getBetweenPrice(Double min, Double max);
    List<Article> getAvailableArticle();
    List<Article> getArticleOrderByPrice(boolean desc);
}
