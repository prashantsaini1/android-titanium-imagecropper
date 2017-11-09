package in.prashant.imagecrop;


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
		
		im = (ImageView) findViewById(image_id);
		Button btn = (Button) findViewById(btn_id);
		btn.setOnClickListener(this);
	}
	
    public void onClick(View v) {
    	CropImage.activity().start(ImageDemo.this);
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
//    	[INFO] :   Intial Path = /storage/emulated/0/com.test.test/camera.jpg
//		[INFO] :   I/**      : RC = 203 : R = -1
//		[INFO] :   I/***     : Path = /data/user/0/com.test.test/cache/cropped-1441703969.jpg
    			
    	if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            Uri resultUri = result.getUri();
            im.setImageURI(resultUri);
        }
    }
}
