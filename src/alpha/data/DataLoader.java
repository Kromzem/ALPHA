package alpha.data;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

/**
 * @author Bobthepeanut
 * 
 * This is a Singleton class. 
 * It's function is to provide a single class every resource can be loaded with.
 */
public class DataLoader {
	//really good images ;)
	public static final int IMAGE = 1337;
	public static final int SOUND = 1338;
	public static final int MUSIC = 1339;
	public static final int ANIMATION = 1340;
	
	private DataLoader() {}
	
	/**
	 * Standard Singleton method to retrieve the instance.
	 * 
	 * @return The instance of DataLoader
	 */
	public static DataLoader getInstance() {
		return DataLoaderHolder.INSTANCE;
	}
	/**
	 * Inner class for storing the instance of DataLoader.
	 */
	private static class DataLoaderHolder {
		private static DataLoader INSTANCE = new DataLoader();
	}
	/**
	 * Method to load a resource.
	 * @param path	The path to the File to load from.
	 * @param c		The class of the object you want to load (e.g. Image).
	 * @return		The Object that was loaded (Should be casted).
	 * @throws		SlickException if an error occured during loading or if you specified a wrong class to load from.
	 */
	public Object load(String path, Class c) throws SlickException {
		if(c.equals(Image.class)) {
			return new Image(path);
		} else if (c.equals(Sound.class)) {
			return new Sound(path);
		} else if (c.equals(Music.class)) {
			return new Music(path);
		} else {
			throw new UnsupportedOperationException("Object to load not found!");
		}
	}
}
