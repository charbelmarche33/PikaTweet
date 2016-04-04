import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *File helps user to search for specific tweet or profile user
 * @author Imran
 */
public class Search {

    ArrayList<Tweet> TweetsThatHaveKeyphrase = new ArrayList(0);
    ArrayList<Accounts> SpecificProfileUser = new ArrayList(0);
    
    /**
     * Gets all the specific tweets that contains the key word that the user inputs in the search bar.
     * It'll iterate through the arraylist of all of the tweets that are visable to user and if
     * the Tweet currentTweet object matches the key word that user put in the search bar,
     * it'll add that to the TweetsThatHaveKeyphrase arraylist and return that specific
     * tweet that the user searched for.
     * @param allTweetsThatAreVisable
     * @param keyphrase
     * @return tweets that have the key phrase from the array list of tweets that contains the key phrase
     * @throws IOException
     * @throws ClassNotFoundException 
     */

    public ArrayList<Tweet> searchTweets(ArrayList<Tweet> allTweetsThatAreVisable, String keyphrase) throws IOException, ClassNotFoundException {
        ListIterator<Tweet> Iterator = allTweetsThatAreVisable.listIterator();
        while (Iterator.hasNext()) {
            Tweet currentTweet = Iterator.next();
            if (currentTweet.getTweetText().contains(keyphrase)) {
                TweetsThatHaveKeyphrase.add(currentTweet);
            }
        }
        return TweetsThatHaveKeyphrase;
    }
    
    /**
     * Gets the specific profile user that the user inputs in the search bar. 
     * It'll iterate through the arraylist of the profile users which will store
     * in the currentProfile Accounts object and keep iterating through the
     * profile user arraylist. If the currentProfile username matches the username
     * that the user is searching for, it'll return the searched profile user
     * @param ProfileUsers
     * @param username
     * @return the specific profile user of who the user searched for
     */

    public Accounts searchforProfileUsers(ArrayList<Accounts> ProfileUsers, String username) {
        ListIterator<Accounts> Iterator = ProfileUsers.listIterator();
        Accounts accountFound = null;
        while (Iterator.hasNext()) {
            Accounts currentProfile = Iterator.next();
            if (currentProfile.getUsername().contains(username)) {
                accountFound = currentProfile;
            }
        }
        return accountFound;
    }

}
