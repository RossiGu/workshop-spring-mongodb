package com.rossiG.workshopspringmongodb.repository;

import com.rossiG.workshopspringmongodb.domain.Post;
import com.rossiG.workshopspringmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
