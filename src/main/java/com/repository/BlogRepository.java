package com.repository;

import com.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    //search blog post by title or content : custom query
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
