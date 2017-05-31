/**
 *
 */
package twitter;
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;




/**
 * @author TKato
 *
 */
public class GetHomeTimeLine {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("HELLO");
	void method(){
		try {
			Twitter twitter = new TwitterFactory().getInstance();
			User user = twitter.verifyCredentials();
			List<Status> statuses = twitter.getHomeTimeline();
			System.out.println("Showing @" + user.getScreenName() + "'s home timeline.");
			System.out.println();
			for (Status status : statuses) {
				System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
				System.out.println();
			 }

		 } catch (TwitterException te) {
			 te.printStackTrace();
			 System.out.println("Failed to get timeline: " + te.getMessage());
			 System.exit(-1);
		 }

	}
}