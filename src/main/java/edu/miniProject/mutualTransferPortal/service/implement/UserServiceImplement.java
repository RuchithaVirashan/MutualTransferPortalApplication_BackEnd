package edu.miniProject.mutualTransferPortal.service.implement;

import edu.miniProject.mutualTransferPortal.model.User;
import edu.miniProject.mutualTransferPortal.model.UserRole;
import edu.miniProject.mutualTransferPortal.repository.RoleRepository;
import edu.miniProject.mutualTransferPortal.repository.UserRepository;
import edu.miniProject.mutualTransferPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null){
            System.out.println("User is already there !!!");
            throw new Exception("User already present !!!");
        } else{
            //user create
            for(UserRole ur: userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
