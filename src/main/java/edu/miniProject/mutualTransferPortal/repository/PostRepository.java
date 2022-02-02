package edu.miniProject.mutualTransferPortal.repository;

import edu.miniProject.mutualTransferPortal.model.Post;
import edu.miniProject.mutualTransferPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
//   public Post findByUsername(String username);
}
