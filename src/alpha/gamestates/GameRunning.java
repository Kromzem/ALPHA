/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.gamestates;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Bobthepeanut
 */
public class GameRunning extends BasicGameState{

	@Override
	public int getID() {
		return 0;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		System.out.println("Initialised");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.fillRect(0, 0, gc.getWidth(), gc.getHeight());
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
	}
	
}
