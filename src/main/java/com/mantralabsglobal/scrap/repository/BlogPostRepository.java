package com.mantralabsglobal.scrap.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mantralabsglobal.scrap.dataobject.BlogPost;

public interface BlogPostRepository extends MongoRepository<BlogPost, String>{

	List<BlogPost> findByTitleLike(String title);
}