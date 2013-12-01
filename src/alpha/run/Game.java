/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.run;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import alpha.gamestates.GameRunning;

/**
 *
 * @author Bobthepeanut
 */
public class Game extends StateBasedGame {
	
	public Game() {
		super("ALPHA");
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		addState(new GameRunning());
	}
	
}
