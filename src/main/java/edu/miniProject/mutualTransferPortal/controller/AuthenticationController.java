package edu.miniProject.mutualTransferPortal.controller;

import edu.miniProject.mutualTransferPortal.config.JwtUtils;
import edu.miniProject.mutualTransferPortal.exception.UserNotFoundException;
import edu.miniProject.mutualTransferPortal.model.JwtRequest;
import edu.miniProject.mutualTransferPortal.model.JwtResponce;
import edu.miniProject.mutualTransferPortal.service.implement.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    //genarate token
    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{

        try {

            authenticate(jwtRequest.getUsername(),jwtRequest.getPassword());

        } catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new Exception("User not found");
        }

        //authenticate

        UserDetails userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponce(token));

    }

    private void authenticate(String username, String password) throws Exception {

        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        } catch (DisabledException e){
            throw new Exception("User disable" + e.getMessage());
        } catch (BadCredentialsException e){
            throw new Exception("Inavalid credentials" +e.getMessage());
        }

    }

}
