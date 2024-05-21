package com.example.Pastebin.services;

import com.example.Pastebin.models.Article;
import com.example.Pastebin.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    public Article findOneArticle(int articleId) {
        Optional<Article> foundedArticle = articleRepository.findById(articleId);
        return foundedArticle.orElse(null);
    }

    @Transactional
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Transactional
    public void updateArticle(int articleId, Article updatedArticle) {
        updatedArticle.setArticleId(articleId);
        articleRepository.save(updatedArticle);
    }

    @Transactional
    public void deleteArticle(int articleId) {
        articleRepository.deleteById(articleId);
    }
}
