package com.example.iran.album_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class KishActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kish);


        ArrayList<String> names_kish = new ArrayList<>();
        ListView lv_kish = findViewById(R.id.lv_kish);

        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");
        names_kish.add("کیش");


        KishAdapter adapter_kish = new KishAdapter(this,names_kish);
        lv_kish.setAdapter(adapter_kish);

        LinearLayout footer_kish = (LinearLayout) getLayoutInflater().inflate(R.layout.footer,null);
        lv_kish.addFooterView(footer_kish);


        Button btn_homee = findViewById(R.id.home);
        btn_homee.setText("خانه");
        btn_homee.setOnClickListener(this);
        Button btn_shomal = findViewById(R.id.ki_sh);
        btn_shomal.setText("شمال");
        btn_shomal.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id){

            case R.id.home :
                Intent intent_homee = new Intent(KishActivity.this,MainActivity.class);
                startActivity(intent_homee);
                break;

            case R.id.ki_sh:
                Intent intent_shomal = new Intent(KishActivity.this,ShomalActivity.class);
                startActivity(intent_shomal);
                break;

        }


    }
}
