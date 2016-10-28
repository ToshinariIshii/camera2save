package com.example.b1014001.camera222;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;


/**
 * Created by b1014001 on 2016/10/28.
 */

public class ResultActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imageView = (ImageView)findViewById(R.id.result_image);
        String name = Camera2Activity.name;
        Bitmap bmImg = BitmapFactory.decodeFile(name);
        imageView.setImageBitmap(bmImg);
    }
}
