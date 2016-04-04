
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * File tests the Search class in conjunction with the Accounts and Tweet
 * class.
 *
 * @author Imran
 */
public class TestFileForSearchTweets {

    private static String username;
    private static ArrayList<Tweet> tweets;
    private static ArrayList<Tweet> allTheseTweets = new ArrayList(0);
    private static Accounts user;

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileStorage storeToFile = new FileStorage();
        VisibleTweetSort visibletweetsort = new VisibleTweetSort();
        Search search = new Search();

        Accounts user1 = new Accounts("Charbel", "cmarche", "Sourlemon1");
        Accounts user2 = new Accounts("Nicco", "nbarratto", "ballislife3");
        Accounts user3 = new Accounts("Imran", "iahmed", "iloveminions2");

        user3.addFollowing("nbarratto");
        
        Tweet tweet = new Tweet("Hello", false, user2.getUsername());
        user2.addNewTweet(tweet);
        Tweet tweet1 = new Tweet("This should work completely like I know charble is a bitch and all. This should work.", true, user3.getName());
        user3.addNewTweet(tweet1);
        ArrayList<Accounts> allUsers = new ArrayList(0);
        Tweet tweet5 = new Tweet("@nbarratto Nicco a bitch, this is later than imran's written and before the latest one", true, user3.getUsername());
        user3.addNewTweet(tweet5);
        Tweet tweet4 = new Tweet("This should be the latest but for nicco", false, user2.getUsername());
        user2.addNewTweet(tweet4);
        Tweet tweet6 = new Tweet("I think @nbarratto likes some dick", false, user1.getUsername());
        user1.addNewTweet(tweet6);
        Tweet tweet7 = new Tweet("Charbel needs to get his adolf haircut. #charassneedsjesus", false, user1.getName());
        user1.addNewTweet(tweet7);
        Tweet tweet8 = new Tweet("Gimme that tree fiddy #treefiddylife", false, user3.getName());
        user3.addNewTweet(tweet8);
        Tweet tweet9 = new Tweet("Get a job #getalife", true, user2.getName());
        user2.addNewTweet(tweet9);
        
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        
        storeToFile.updateAllUsersInfoInUniverse(allUsers);
        allUsers = storeToFile.retrieveAllUserInfoInUniverse();
        ListIterator<Accounts> iterator = allUsers.listIterator();
        while (iterator.hasNext()) {
            Accounts current = iterator.next();
            username = current.getUsername();
            String password = current.getPassword();
            ArrayList<String> following = current.getPeopleFollowed();
            tweets = current.getTweetsMadeByUser();
            System.out.println("Username: " + username + " Password: " + password + "\nFollowing: ");
            ListIterator<String> Followingiter = following.listIterator();
            while (Followingiter.hasNext()) {
                String individual = Followingiter.next();
                System.out.print(individual + "\n");
            }
            System.out.println("Tweets: ");
            ListIterator<Tweet> Tweetiter = tweets.listIterator();
            while (Tweetiter.hasNext()) {
                Tweet theTweet = Tweetiter.next();
                System.out.print(theTweet.getTweetText() + "\n");
                allTheseTweets.add(theTweet);
            }
        }
        System.out.println();
        System.out.println("Test to find tweets: ");
        tweets = search.searchTweets(allTheseTweets, "#");
        for (int i = 0; i < tweets.size(); i++) {
            System.out.println(tweets.get(i).getTweetText());
        }
        
        System.out.println();
        System.out.println("Test to find Username: ");
        user = search.searchforProfileUsers(allUsers, "iahmed");
        System.out.println(user.getName() + " username: " + user.getUsername() + 
        " \n" + user.getUsername() + " password: " + user.getPassword() + " \n" 
        + user.getUsername() + " name: " + user.getName());
        
        
    }

}
