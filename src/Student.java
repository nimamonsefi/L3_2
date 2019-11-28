/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Student {
    private String name;
    private  String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public void checkName(String name) throws MyException{
        if(!name.equalsIgnoreCase(this.name)){
            throw new MyException();
        }
    }
    
    public void checkUsername(String username) throws MyException{
        if(!username.equalsIgnoreCase(this.username)){
            throw new MyException();
        }
    }
    
    public void checkPassword(String password) throws MyException{
        if(!password.equals(this.password)){
            throw new MyException();
        }
    }
    
}
