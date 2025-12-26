package com.example.firstproject.service;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //서비스 객체 생성
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
    public List<Article> index() {
        return articleRepository.findAll();
    }

}

