/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.data;

import java.util.HashMap;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Bobthepeanut
 */
public class ImageData {

	private HashMap<String, Image> categories = new HashMap<>(), elements = new HashMap<>();

	private ImageData() {
	}

	public static ImageData getInstance() {
		return ImageDataHolder.INSTANCE;
	}

	private static class ImageDataHolder {

		private static final ImageData INSTANCE = new ImageData();
	}

	public void initialize() throws SlickException {
		DataLoader l = DataLoader.getInstance();

		categories.put("Air", ((Image) l.load("res/imgs/categories/Air.png", Image.class)));
		categories.put("Water", ((Image) l.load("res/imgs/categories/Water.png", Image.class)));
		categories.put("Fire", ((Image) l.load("res/imgs/categories/Fire.png", Image.class)));
		categories.put("Earth", ((Image) l.load("res/imgs/categories/Earth.png", Image.class)));

		elements.put("Air", ((Image) l.load("res/imgs/elements/Air.png", Image.class)));
		elements.put("Fire", ((Image) l.load("res/imgs/elements/Fire.png", Image.class)));
	}

	public HashMap<String, Image> getCategories() {
		return categories;
	}

	public HashMap<String, Image> getElements() {
		return elements;
	}
	
	public Image getElementByName(String name) {
		return elements.get(name);
	}
	
	public Image getCategoryByName(String name) {
		return categories.get(name);
	}
}
