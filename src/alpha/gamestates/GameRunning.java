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

import alpha.data.ImageData;
import java.util.HashMap;
import java.util.Iterator;
import org.newdawn.slick.Image;

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
		ImageData.getInstance().initialize();
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		HashMap<String, Image> categories = ImageData.getInstance().getCategories();
		HashMap<String, Image> elements = ImageData.getInstance().getElements();
		Iterator<Image> i = categories.values().iterator();
		int widthOffset = 0;
		while(i.hasNext()) {
			Image img = i.next();
			img.draw(widthOffset, 0);
			widthOffset += img.getWidth();
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
	}
	
}
