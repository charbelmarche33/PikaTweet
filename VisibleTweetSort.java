import java.util.*;
/**
 * File defines VisableTweetSort class
 * @author Charbel
 */
public class VisibleTweetSort{
    /**
     * This class can take an ArrayList of type Accounts and get all the public tweets, or all the tweets that are visible for a specific user.
     */
    public VisibleTweetSort(){}
    /**
     * Gets all the public tweets form an ArrayList<Accounts> and sorts them so that the latest tweet is put first.
     * @param AllUsers ArrayList of type Accounts that you would like to get all the private tweets from. 
     * @return Returns an ArrayList of type tweet, sorted so that the most recent tweet is first and the oldest is last. 
     */
    public ArrayList<Tweet> getAllPublicTweetsByDate(ArrayList<Accounts> AllUsers){
        allVisibleTweets.clear();
        addAllPublicTweetsToVisible(AllUsers);
        Collections.sort(allVisibleTweets);
        return allVisibleTweets;
    } 
    /**
     * Gets all the visible tweets for a specific user. This includes all public tweets, and the private tweets of the users that the user follows
     * It will have any tweets with an "@<user's username>" at the beginning of the ArrayList and these will be sorted by date. The rest of the tweets 
     * will be after that sorted by date as well.
     * @param AllUser ArrayList of type Accounts that you would like to get all the private tweets from.
     * @param username String of the username of the current user.
     * @return Method returns an ArrayList of all visable tweets ordered so @username is first then the others are by date.
     */
    public ArrayList<Tweet> getAllVisibleTweetsForUser(ArrayList<Accounts> AllUser, String username){
        allVisibleTweets.clear();
        ListIterator<Accounts> iterator = AllUser.listIterator();
        ArrayList<String> followedAccounts = getUsernamesOfPeopleFollowed(AllUser, username);
        ListIterator<String> followingIter = followedAccounts.listIterator();
        while (followingIter.hasNext()){
            String currentUsername = followingIter.next();
            for (int i = 0; i < AllUser.size(); i++){
                if (AllUser.get(i).getUsername().equals(currentUsername))
                   addPrivateTweetsOfAccountToVisible(AllUser.get(i));
                }
        }
        addAllPublicTweetsToVisible(AllUser);
        Collections.sort(allVisibleTweets);
        putAtUsernameTweetsFirst(username);
        return allVisibleTweets;
    }
    private ArrayList<String> getUsernamesOfPeopleFollowed(ArrayList<Accounts> AllUser, String username){
        ListIterator<Accounts> iterator = AllUser.listIterator();
        ArrayList<String> followedAccounts = new ArrayList(0);
        while(iterator.hasNext()){
            Accounts current = iterator.next();
            if(current.getUsername().equals(username)){
                followedAccounts = current.getPeopleFollowed();
            }
        }
        return followedAccounts;
    }
    private void putAtUsernameTweetsFirst(String username){
        int count = 0;
        for (int n = allVisibleTweets.size() - 1; n >= 0; n--){
            if(allVisibleTweets.get(n).getTweetText().contains("@" + username)){
                allVisibleTweets.add(0, allVisibleTweets.get(n));
                allVisibleTweets.remove(n+1);
                count = count + 1;
                if(n == count){
                    break;
                }
                else{
                    n = n + 1;
                }
            }
        }
    }
    private void addAllPublicTweetsToVisible(ArrayList<Accounts> AllUsers){
        ListIterator<Accounts> iterator = AllUsers.listIterator();
        while(iterator.hasNext()){
            Accounts current = iterator.next();
            addPublicTweetsOfAccountToVisible(current);
        }
    }
    private void addPublicTweetsOfAccountToVisible(Accounts current){
            ArrayList<Tweet> tweet = current.getTweetsMadeByUser();
            ListIterator<Tweet> tweetIter = tweet.listIterator();
            while(tweetIter.hasNext()){
                Tweet currentTweet = tweetIter.next();
                if (currentTweet.isPrivate() == false){
                    allVisibleTweets.add(currentTweet);   
                }
            } 
    }
    private void addPrivateTweetsOfAccountToVisible(Accounts current){
            ArrayList<Tweet> tweet = current.getTweetsMadeByUser();
            ListIterator<Tweet> tweetIter = tweet.listIterator();
            while(tweetIter.hasNext()){
                Tweet currentTweet = tweetIter.next();
                if (currentTweet.isPrivate() == true){
                    allVisibleTweets.add(currentTweet);  
                }
            }
    }
    ArrayList<Tweet> allVisibleTweets = new ArrayList(0);
}
