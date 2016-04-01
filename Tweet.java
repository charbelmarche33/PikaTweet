package pikatweet;

public class Tweet {
    /**
     * Class Tweet stores the information on a tweet including its text
     * @param text A string that holds the text of the message to be tweeted.
     * @param date A string that holds the date that the tweet was tweeted.
     * @param privat A Boolean that signifies if the tweet is public or private.
     */
    public Tweet(String text, String date, Boolean privat){
        Text = text;
        Date = date;
        Private = privat;
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
    public String getTimeTweeted(){
        return Date;
    }
    /**
     * Returns the privacy level of the tweet. If true then it is private, false then it is public.
     * @return Boolean true for private, false for public.
     */
    public Boolean isPrivate(){
        return Private;
    }
    private String Text;
    private String Date;
    private Boolean Private;
}
