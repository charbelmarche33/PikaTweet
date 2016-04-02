package pikatweet;

import java.io.*;
import java.util.*;
/**
 * File defines the class Tweet 
 * @author Charbel
 */
public class Tweet implements Serializable{
    /**
     * Class Tweet stores the information on a tweet including its text
     * @param text A string that holds the text of the message to be tweeted.
     * @param date A string that holds the date that the tweet was tweeted.
     * @param privat A Boolean that signifies if the tweet is public or private.
     */
    public Tweet(String text, Boolean privat){
        Text = text;
        Private = privat;
        now = new Date();
    }
    /**
     * Gets the text of the tweet.
     * @return String that contains the text of the tweet.
     */
    public String getTweetText(){
        return Text;
    }
    /**
     * Returns the string of the time the tweet was sent.
     * @return String that contains the date in *some format*
     */
    public Date getTimeTweeted(){
        return now;
    }
    /**
     * Returns the privacy level of the tweet. If true then it is private, false then it is public.
     * @return Boolean true for private, false for public.
     */
    public Boolean isPrivate(){
        return Private;
    }
    private String Text;
    private Boolean Private;
    private Date now;
}
