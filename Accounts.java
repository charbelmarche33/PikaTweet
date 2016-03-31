import java.util.ArrayList;
import java.io.*;
/**
 * File defines accounts class.
 * @author Charbel 
 */
public class Accounts implements Serializable {
   public Accounts(String name, String username, String password){
        Username = username;
        Password = password;
        Name = name;
    }
    /**
     * Gets the username of this PokeTrainer.
     * @return String value of the Username
     */
    public String getUsername(){
        return Username;
    }
    /**
     * Gets the password associated with the username.
     * @return String value of the Password
     */
    public String getPassword(){
        return Password;
    }
    /**
     * Gets the name of the user
     * @return String name
     */
    public String getName(){
        return Name;
    }
    /**
     * Sets the Username if one chose to change it.
     * @param newUsername the username that you want to change to of type String
     */
    public void setUsername(String newUsername){
        Username = newUsername;
    }
    /**
     * Sets the Password if one chose to change it.
     * @param newPassword the new password of type String
     */
    public void setPassword(String newPassword){
        Password = newPassword;
    }
    /**
     * Changes the name of user associated with their account
     * @param newName String of the desired new name
     */
    public void setName(String newName){
        Name = newName;
    }
    /**
     * Adds a follower, takes in the username of the person to be followed.
     * @param username the String value of the username of the new person that is being followed.
     */
    public void addFollowing(String username){
        Following.add(username);
    }
    /**
     * Adds a tweet to the list of personal tweets.
     * @param tweet the tweet to be added of type Tweet.
     */
    public void addNewTweet(Tweet tweet){
        PersonalTweets.add(tweet);
    }
    /**
     * Gets the list of people that user follows and that user should be able to see both pubic and private tweets from.
     * @return ArrayList of type String that contains all the usernames of the poketrainers that the user follows.
     */
    public ArrayList<String> getPeopleFollowed(){
        return Following;
    }
    /**
     * Gets the tweets that are made by the user.
     * @return ArrayList of type Tweet that contains all of this user's tweets.
     */
    public ArrayList<Tweet> getTweetsMadeByUser(){
        return PersonalTweets;
    }
    private String Username;
    private String Password;
    private String Name;
    private ArrayList<String> Following = new ArrayList(0);
    private ArrayList<Tweet> PersonalTweets = new ArrayList(0);
}

