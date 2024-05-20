package com.example.Pastebin.repositories;

import com.example.Pastebin.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Integer>{
}
