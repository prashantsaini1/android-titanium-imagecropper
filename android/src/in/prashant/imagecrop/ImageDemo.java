package in.prashant.imagecrop;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.util.TiRHelper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.theartofdev.edmodo.cropper.*;

public class ImageDemo extends AppCompatActivity implements View.OnClickListener {
	private int layout_id;
	private int btn_id;
	private int image_id;
	ImageView im;
	
	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		getIDs();
		setContentView(layout_id);
		Button btn = (Button) findViewById(btn_id);
		btn.setOnClickListener(this);
		
		im = (ImageView) findViewById(image_id);
	}
	
    public void onClick(View v) {
    	CropImage.startPickImageActivity(this);
    }
    
    private void getIDs() {
    	try {
    		layout_id = TiRHelper.getResource("layout.main_layout");
        	btn_id = TiRHelper.getResource("id.btn");
        	image_id = TiRHelper.getResource("id.im");
    	} catch(Exception exc){}
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// Image picker result is fine as : RC = 200 : R = -1
    	Log.i("**", "RC = " + requestCode + " : R = " + resultCode);

    	// handle result of pick image chooser
    	if (requestCode == CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
    		Uri imageUri = CropImage.getPickImageResultUri(this, data);
    		im.setImageURI(imageUri);
        
    		// starts crashing here with this result immediately : RC = 203 : R = 0
    		// CropImage.activity(imageUri).start(this);
    	}
    }
}
