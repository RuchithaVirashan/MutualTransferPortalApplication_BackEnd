package edu.miniProject.mutualTransferPortal.service.implement;

import edu.miniProject.mutualTransferPortal.model.Post;
import edu.miniProject.mutualTransferPortal.repository.PostRepository;
import edu.miniProject.mutualTransferPortal.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post addPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Set<Post> getPost() {
        return new LinkedHashSet<>(this.postRepository.findAll());
    }

    @Override
    public Post getPost(Long postId) {
        return this.postRepository.findById(postId).get();
    }

    @Override
    public void deletePost(Long postId) {
        Post post = new Post();
        post.setPostId(postId);
        this.postRepository.delete(post);
    }
}
