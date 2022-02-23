package edu.miniProject.mutualTransferPortal.controller;

import edu.miniProject.mutualTransferPortal.model.Post;
import edu.miniProject.mutualTransferPortal.model.User;
import edu.miniProject.mutualTransferPortal.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostService postService;

    //add post
    @PostMapping
    public ResponseEntity<?> addPost(@RequestBody Post post){
        Post postn = this.postService.addPost(post);
        return ResponseEntity.ok(postn);
    }

    //get post
    @GetMapping("/{postId}")
    public Post getPost(@PathVariable("postId") Long postId) {
        return this.postService.getPost(postId);
    }

    //get all post
    @GetMapping
    public ResponseEntity<?> getPost(){
        return ResponseEntity.ok(this.postService.getPost());
    }

    //update post
    @PutMapping
    public Post updatePost(@RequestBody Post post){
        return this.postService.updatePost(post);
    }

    //delete post
    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable("postId") Long postId){
        this.postService.deletePost(postId);
    }

}
