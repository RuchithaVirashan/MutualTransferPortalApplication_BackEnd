package edu.miniProject.mutualTransferPortal;

import edu.miniProject.mutualTransferPortal.model.Role;
import edu.miniProject.mutualTransferPortal.model.User;
import edu.miniProject.mutualTransferPortal.model.UserRole;
import edu.miniProject.mutualTransferPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MutualTransferPortalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(MutualTransferPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("starting code");

//		User user= new User();
//
//		user.setUsername("ruchi123");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//		user.setDesignation("Teacher");
//
//		Role role =new Role();
//		role.setRoleId(43L);
//		role.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}




}
