import java.util.*;
import java.io.*;
/**
 * File creates a file that stores the arraylist of all the users information.
 * @author Charbel
 */
public class FileStorage implements Serializable{
    /**
     * Saves the ArrayList of users AllUsers to the file
     * @param AllUsers The array list of type <Account> that stores all the users of the pikaTweet software
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void updateAllUsersInfoInUniverse(ArrayList<Accounts> AllUsers) throws FileNotFoundException, IOException{
        FileOutputStream fileOut = new FileOutputStream("AllUsers.dat");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(AllUsers);
        out.close();
        fileOut.close();
    }
    /**
     * Retrieves information (an array list) of all the user accounts that are available
     * @return the array list of type account of all the users
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Accounts> retrieveAllUserInfoInUniverse() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("AllUsers.dat"));
        ArrayList<Accounts> AllUsers = new ArrayList(0);
        AllUsers = (ArrayList<Accounts>) in.readObject();
        in.close();
        return AllUsers;
    }
    
}