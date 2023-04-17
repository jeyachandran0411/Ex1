import java.util.Scanner;

public class login {
    public static void main(String[] args) {
       login1 jey=new login1();
     
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Name");
         String str=sc.nextLine();
         System.out.println("Enter your password"); 
         String str1=sc.nextLine();
     if(jey.username .equals(str)&& jey.password.equals(str1)){
        System.out.println("Your username and password correct");
     }
     else{
        System.out.println("Sorry, Your username and password are incorrect");
     }        
    }
}
