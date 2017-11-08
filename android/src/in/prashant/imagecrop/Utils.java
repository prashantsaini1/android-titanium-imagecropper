package in.prashant.imagecrop;

import org.appcelerator.titanium.util.TiRHelper;

public class Utils {
	public static int getR(String path) {
		try {
			return TiRHelper.getResource(path);
			
		} catch (Exception exc) {
			return -1;
		}
	}
	
	public static int getRArray(String path) {
		try {
			return TiRHelper.getResource(path);
			
		} catch (Exception exc) {
			return 0;
		}
	}
}
