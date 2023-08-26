package com.rossiG.workshopspringmongodb.services;

import com.rossiG.workshopspringmongodb.domain.Post;
import com.rossiG.workshopspringmongodb.domain.User;
import com.rossiG.workshopspringmongodb.dto.UserDTO;
import com.rossiG.workshopspringmongodb.repository.PostRepository;
import com.rossiG.workshopspringmongodb.repository.UserRepository;
import com.rossiG.workshopspringmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
