package in.prashant.imagecrop;


public class Params {
	public static final String LCAT = "ImagepickerModule";

    // parameters for crop-activity customizations
    public static final String ACTIVITY_THEME = "theme";
    public static final String STATUS_BAR_COLOR = "colorPrimaryDark";
    public static final String BAR_COLOR = "colorPrimary";
    public static final String TITLE = "title";
    public static final String CROP_BTN_TITLE = "cropButtonTitle";
    public static final String BACKGROUND_COLOR = "backgroundColor";

    // parameters for crop-view customizations
    public static final String OVERLAY_BG_COLOR = "overlayBackgroundColor";
    public static final String BORDER_COLOR = "borderColor";
    public static final String BORDER_WIDTH = "borderWidth";
    public static final String GUIDELINES = "guidelines";
    public static final String GUIDELINES_COLOR = "guidelinesColor";
    public static final String GUIDELINES_WIDTH = "guidelinesWidth";
    public static final String ASPECT_RATIO_X = "aspectX";
    public static final String ASPECT_RATIO_Y = "aspectY";
    public static final String FIX_ASPECT_RATIO = "fixAspect";
    public static final String CROP_WINDOW_PADDING = "cropWindowPadding";
    public static final String CORNER_COLOR = "cornerBorderColor";
    public static final String CORNER_WIDTH = "cornerBorderWidth";
    public static final String CORNER_LENGTH = "cornerBorderLength";
    public static final String CORNER_OFFSET = "cornerBorderOffset";

    // image source & destination options
    public static final String IMAGE_SOURCE = "sourceFile";
    public static final String IMAGE_DEST = "destFile";

    public static final String CALLBACK = "callback";


    public static class Defaults {
        public static String TITLE = "Crop Image";
    }

	private static String checkTransparentColor(Object key) {
		if (key instanceof String) {
			String color =  (String) key;
			return (color.equalsIgnoreCase("transparent")) ? "#00000000" : color;	// transparent color hex
		}

		return "#00000000";
	}
}
