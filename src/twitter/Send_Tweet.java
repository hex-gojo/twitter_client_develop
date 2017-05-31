/**
 *
 */
package twitter;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
/**
 * @author TKato
 *
 */
public class Send_Tweet {
	void send_tweet(/*String[] args*/) throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
		User user = twitter.verifyCredentials();
		System.out.println(user.getName());
		System.out.println(user.getScreenName());
		System.out.println(user.getFriendsCount());
		System.out.println(user.getFollowersCount());

		Status status = twitter.updateStatus("輪講おしまい #twitter4j");
	}
}
