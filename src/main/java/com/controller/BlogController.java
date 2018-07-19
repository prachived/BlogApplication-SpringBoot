package com.controller;

import com.model.Blog;
import com.model.BlogData;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    BlogData blogData = BlogData.getInstance();

    @GetMapping("/blog")
    public List<Blog> index()
    {
        return blogData.fetchBlogs();
    }

    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable String id)
    {
        int blogId = Integer.parseInt(id);
        return  blogData.getBlogById(blogId);
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body)
    {
        String searchTerm = body.get("text");
        return blogData.searchBlogs(searchTerm);
    }

    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body)
    {
        int id = Integer.parseInt(body.get("id"));
        String title = body.get("title");
        String content = body.get("content");
        return blogData.createBlog(id, title, content);
    }

    @PutMapping("/blog/{id}")
    public Blog update(@PathVariable String id, @RequestBody Map<String, String> body)
    {
        int blogId = Integer.parseInt(id);
        String title = body.get("title");
        String content = body.get("content");
        return blogData.updateBlog(blogId,title,content);
    }

    @DeleteMapping("blog/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogData.delete(blogId);
    }


}
