/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student s=new Student();
        
        System.out.print("Sign Up\nEnter Your Name : ");
        s.setName(scanner.next());
        System.out.print("Enter UserName : ");
        s.setUsername(scanner.next());
        System.out.print("Enter Password : ");
        s.setPassword(scanner.next());
        
        try{
            System.out.print("\n\nLog In\nName : ");
            s.checkName(scanner.next());
        }catch(MyException e){
            System.out.println("Name Is Not Correct !!!");
        }
        
        try{
            System.out.print("UserName : ");
            s.checkUsername(scanner.next());
        }catch(MyException e){
            System.out.println("UserName Is Not Correct !!!");
        }
        
        try{
            System.out.print("Password : ");
            s.checkPassword(scanner.next());
        }catch(MyException e){
            System.out.println("Password Is Not Correct !!!");
        }
    }
    
}
    

