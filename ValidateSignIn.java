
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SwaggyP
 */
public class ValidateSignIn {
boolean signedOn;
Accounts users;
    public void signedon() throws FileNotFoundException, IOException, ClassNotFoundException {
        signedOn = false;
        SignInTest test = new SignInTest();
        Scanner input = new Scanner(System.in);
        Accounts accountFound = null;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("AllUsers.dat"));
        ArrayList<Accounts> AllUsers = new ArrayList(0);
        AllUsers = (ArrayList<Accounts>) in.readObject();
        ListIterator<Accounts> Iterator = AllUsers.listIterator();

        System.out.println("Enter username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();

        //loops through the the array lists to find matched user name and password
        for (int i = 0; i < AllUsers.size(); i++) {
            users = AllUsers.get(i);
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                //System.out.println("match!");
                signedOn = true;
                
                System.out.println(users.getUsername() + users.getPassword() + ": matched");
            } if (!users.getUsername().equals(username) || !users.getPassword().equals(password)) {
                 System.out.println("Username or password does not match!");
            }
            
        }
        
       
    }
}
//            Accounts users = test.searchforProfileUsers(AllUsers, username, password);
//          System.out.println(users.getUsername()+ " " + users.getPassword());
//        }
//
//    }

