/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.run;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Bobthepeanut
 */
public class Main {
	private static AppGameContainer apg;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws SlickException {
		apg = new AppGameContainer(new Game());
		apg.setDisplayMode(1920, 1080, true);
		apg.start();
	}
}
