package edu.miniProject.mutualTransferPortal.service;

import edu.miniProject.mutualTransferPortal.model.User;
import edu.miniProject.mutualTransferPortal.model.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    //creating User
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get User by username
    public User getUser(String username);

    //delete user by Id
    void deleteUser(Long userId);
}
