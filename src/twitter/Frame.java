/**
 *
 */
package twitter;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.TwitterException;

/**
 * @author TKato
 *
 */
public class Frame {
	//p204
	void frame() throws TwitterException{
	//public static void main(String[] args){
		//フレームオブジェクトの生成
		JFrame frame = new JFrame("Twitter Client");

		//フレームの設定
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//FlowLayoutの生成と設定
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		frame.setLayout(flow);

		//ボタンの生成と配置
		JButton tweet_button = (JButton)frame.add(new JButton("ツイート"));
		JButton TL_button = (JButton)frame.add(new JButton("TL表示"));

		//テキストボックスの生成
		JPanel p = (JPanel)frame.add(new JPanel());
		JTextField textfield = new JTextField(10);
		p.add(textfield);

		//フレームの表示
		frame.setVisible(true);
	}

}
