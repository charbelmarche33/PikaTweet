import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/**
 * File tests the FileStorage class in conjunction with the Accounts and Tweet class.
 * @author Charbel
 */
public class TestFileForFileStorage{
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
        FileStorage storeToFile = new FileStorage();
        Accounts user1 = new Accounts("Charbel", "cmarche", "Sourlemon1");
        Accounts user2 = new Accounts("Nicco", "nbarratto", "ballislife3");
        Accounts user3 = new Accounts("Imran", "iahmad", "iloveminions2");
        
        user3.addFollowing("nbarratto");
        
        Tweet tweet = new Tweet("Hello", "3/31/2016", false);
        user2.addNewTweet(tweet);
        Tweet tweetTest = new Tweet("Imran is better than me in basketball", "4/1/2016", false);
        uesr1.addNewTweet(tweetTest);
        
        ArrayList<Accounts> allUsers = new ArrayList(0);
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        storeToFile.updateAllUsersInfoInUniverse(allUsers);
        allUsers = storeToFile.retrieveAllUserInfoInUniverse();
        ListIterator<Accounts> iterator = allUsers.listIterator();
        while (iterator.hasNext()){
            Accounts current = iterator.next();
            String username = current.getUsername();
            String password = current.getPassword();
            ArrayList<String> following = current.getPeopleFollowed();
            ArrayList<Tweet> tweets = current.getTweetsMadeByUser();
            System.out.println("Username: " + username + " Password: " + password + "\nFollowing: ");
            ListIterator<String> Followingiter = following.listIterator();
            while (Followingiter.hasNext()){
                String individual = Followingiter.next();
                System.out.print(individual + "\n");
            }
            System.out.println("Tweets: ");
            ListIterator<Tweet> Tweetiter = tweets.listIterator();
            while (Tweetiter.hasNext()){
                Tweet theTweet = Tweetiter.next();
                System.out.print(theTweet.getTweetText() + "\n" + "\n");
            }
        }
    }   
}
