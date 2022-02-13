package edu.miniProject.mutualTransferPortal.exception;

public class UserFoundException extends Exception{
    public UserFoundException(){
        super("User with this User name is already there in DB!! Try another Username");
    }
    public UserFoundException(String message){
        super(message);
    }
}
