package com.anik.navwithfragment.second;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.anik.navwithfragment.R;

public class SecondActivity extends AppCompatActivity {

    Button btnSurprise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnSurprise=(Button)findViewById(R.id.btnSurprise);

        btnSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,LoadImageActivity.class);

                startActivity(intent);
            }
        });

    }
}
