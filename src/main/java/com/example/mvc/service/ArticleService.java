package com.example.mvc.service;

import com.example.mvc.dao.ArticleDao;
//import com.example.mvc.dao.ArticleSpringDao;
import com.example.mvc.dao.ArticleSpringJpaDao;
import com.example.mvc.dto.ArticleDto;
import com.example.mvc.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

//    ArticleDao articleDao;
//
//    @Autowired
//    public ArticleService(ArticleDao articleDao) {
//        this.articleDao = articleDao;
//    }
//
    ArticleSpringJpaDao articleDao;

    @Autowired
    public ArticleService(ArticleSpringJpaDao articleDao) {
        this.articleDao = articleDao;
    }

    public List<Article> getAllArticles(){

//        for (Article article : storage) {
//
//        }
//        return storage;

        List<Long> ids= new ArrayList<>();
        ids.add(1L);
        ids.add(4L);
        ids.add(7L);
        ids.add(5L);
        return (List<Article>) articleDao.findAll();
//        return articleDao.findAllByNameLikeAndPriceBetween(namePattern, lowPrice, highPrice);
    }

//    private ArticleDto ArticleToDto(Article article){
//        return new ArticleDto(article.getId())
//    }

}
