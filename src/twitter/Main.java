package twitter;
import twitter4j.TwitterException;
/**
 *
 */

/**
 * @author TKato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GetHomeTimeLine p1 = new GetHomeTimeLine();
		p1.method();

		System.out.println("■■■■■■■■■■■■■■■■■■■■");

		SerchTerm p2 = new SerchTerm();
		try {
			p2.serch_term();
		} catch (TwitterException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("■■■■■■■■■■■■■■■■■■■■");

		Send_Tweet p3 = new Send_Tweet();
		try {
			p3.send_tweet();
		} catch (TwitterException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("■■■■■■■■■■■■■■■■■■■■");

		Frame p4 = new Frame();
		try {
			p4.frame();
		} catch (TwitterException e){
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("■■■■■■■■■■■■■■■■■■■■");

		Follow_User p5 = new Follow_User();
		try {
			p5.follow_user();
		} catch (TwitterException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}