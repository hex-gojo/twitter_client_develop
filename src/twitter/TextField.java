/**
 *
 */
package twitter;

import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.TwitterException;

/**
 * @author TKato
 *
 */
public class TextField {
	void textfield() throws TwitterException{
		/*public static void main(String[] args){*/

		JTextField textfield = new JTextField(10);
		JPanel p = new JPanel();

		p.add(textfield);

	}
}
