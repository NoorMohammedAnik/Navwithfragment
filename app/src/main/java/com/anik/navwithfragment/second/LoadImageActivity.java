package com.anik.navwithfragment.second;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.anik.navwithfragment.R;
import com.bumptech.glide.Glide;

public class LoadImageActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);

        img=(ImageView)findViewById(R.id.imgLoad);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Salman_Khan_filmfare.jpg/220px-Salman_Khan_filmfare.jpg")  // img url
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.no_img)
                        .into(img);

    }
}
