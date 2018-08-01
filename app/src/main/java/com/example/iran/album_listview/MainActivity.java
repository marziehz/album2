package com.example.iran.album_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ShomalImage = findViewById(R.id.ShomalImage);
        ImageView KishImage = findViewById(R.id.KishImage);

        ShomalImage.setOnClickListener(this);
        KishImage.setOnClickListener(this);

    }




    @Override
    public void onClick(View view) {

         int id = view.getId();

         switch (id){
             case R.id.ShomalImage:
                 Intent intent1 = new Intent(MainActivity.this , ShomalActivity.class);
                 startActivity(intent1);
                 break;
             case R.id.KishImage:
                 Intent intent2 = new Intent(MainActivity.this ,KishActivity.class);
                 startActivity(intent2);
                 break;





         }


    }
}
