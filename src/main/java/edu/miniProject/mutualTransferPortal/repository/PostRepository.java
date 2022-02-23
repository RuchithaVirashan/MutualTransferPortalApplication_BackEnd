package edu.miniProject.mutualTransferPortal.repository;

import edu.miniProject.mutualTransferPortal.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
