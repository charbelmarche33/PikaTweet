import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/**
 * File tests the FileStorage class in conjunction with the Accounts and Tweet class.
 * @author Charbel
 */
public class TestForVisableTweetSort{
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
        FileStorage storeToFile = new FileStorage();
        Scanner in = new Scanner(System.in);
        Accounts user1 = new Accounts("Charbel", "cmarche", "Sourlemon1");
        Accounts user2 = new Accounts("Nicco", "nbarratto", "ballislife3");
        Accounts user3 = new Accounts("Imran", "iahmad", "iloveminions2");
        user2.addFollowing("iahmad");
        System.out.println("Charbel make a tweet");
        String tweettextC = in.nextLine();
        Tweet tweet1 = new Tweet(tweettextC, false, user1.getUsername());
        user1.addNewTweet(tweet1);
        System.out.println("Imran make a tweet");
        String tweettextI1 = in.nextLine();
        Tweet tweet2 = new Tweet(tweettextI1, false, user3.getUsername());
        user3.addNewTweet(tweet2);
        Tweet tweet5 = new Tweet("@nbarratto Nicco a bitch, this is later than imran's written and before the latest one", true, user3.getUsername());
        user3.addNewTweet(tweet5);
        Tweet tweet4 = new Tweet("This should be the latest but for nicco", false, user2.getUsername());
        user2.addNewTweet(tweet4);
        System.out.println("Imran make tweet private tho");
        String tweettextI2 = in.nextLine();
        Tweet tweet3 = new Tweet(tweettextI2, true, user3.getUsername());
        user3.addNewTweet(tweet3);
        Tweet tweet6 = new Tweet("I think @nbarratto likes some dick", false, user1.getUsername());
        user1.addNewTweet(tweet6);
        ArrayList<Accounts> allUsers = new ArrayList(0);
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        VisibleTweetSort tweets = new VisibleTweetSort();
        ArrayList<Tweet> Tweets = tweets.getAllPublicTweetsByDate(allUsers);
        for (int i = 0; i < Tweets.size(); i++){
            System.out.println("The tweet says: " + Tweets.get(i).getTweetText());
        }
        Tweets = tweets.getAllVisibleTweetsForUser(allUsers, "nbarratto");
        System.out.println("This is the niccos tweets: \n");
        for (int n = 0; n < Tweets.size(); n++){
            System.out.println("The tweet says: " + Tweets.get(n).getTweetText());
        }
    }   
}

