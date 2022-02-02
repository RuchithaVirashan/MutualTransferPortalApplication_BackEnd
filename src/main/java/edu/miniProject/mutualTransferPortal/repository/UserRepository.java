package edu.miniProject.mutualTransferPortal.repository;

import edu.miniProject.mutualTransferPortal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);
}
