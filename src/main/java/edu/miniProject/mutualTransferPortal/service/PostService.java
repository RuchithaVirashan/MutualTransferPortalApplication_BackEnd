package edu.miniProject.mutualTransferPortal.service;

import edu.miniProject.mutualTransferPortal.model.Post;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PostService {
    public Post addPost(Post post);

    public Post updatePost(Post post);

    public Set<Post> getPost();

    //get Post by username
//    public Post getPost(String username);

    public Post getPost(Long postId);

    public void deletePost(Long postId);
}
