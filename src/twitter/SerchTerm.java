/**
 *
 */
package twitter;
//import twitter4j.User;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
//import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
/**
 * @author TKato
 *
 */
public class SerchTerm {

	/**
	 * @param args
	 */
	void serch_term()/*public static void main(String[] args)*/throws TwitterException {
		// TODO 自動生成されたメソッド・スタブ
		Twitter twitter = new TwitterFactory().getInstance();
		Query query = new Query();
		query.setQuery("内定");
		QueryResult result = twitter.search(query);
		System.out.println("ヒット数: "+result.getTweets().size());
		for(Status tweet : result.getTweets()){
			System.out.println(tweet.getText());
			System.out.println();
			System.out.println(tweet.getUser());
			System.out.println();
			System.out.println(tweet.getCreatedAt());
			System.out.println("-------------------------");
		}
	}

}
