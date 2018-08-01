package com.example.iran.album_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ShomalActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shomal);


        ArrayList<String> names_shomal = new ArrayList<>();
        ListView lv_shomal = findViewById(R.id.lv_shomal);

        names_shomal.add("قلعه رودخان");
        names_shomal.add("قلعه رودخان");
        names_shomal.add("قلعه رودخان");
        names_shomal.add("قلعه رودخان");
        names_shomal.add("قلعه رودخان");
        names_shomal.add("ماسوله");
        names_shomal.add("ماسوله");
        names_shomal.add("ماسوله");



        LinearLayout footer_shomal = (LinearLayout) getLayoutInflater().inflate(R.layout.footer,null);
        lv_shomal.addFooterView(footer_shomal);


        ShomalAdapter adapter_shomal = new ShomalAdapter(this, names_shomal);
        lv_shomal.setAdapter(adapter_shomal);

        Button btn_home = findViewById(R.id.home);
        btn_home.setText("خانه");
        btn_home.setOnClickListener(this);
        Button btn_kish = findViewById(R.id.ki_sh);
        btn_kish.setText("کیش");
       // btn_kish.setBackgroundColor(000);
        btn_kish.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id){
            case R.id.home:

                Intent intent_home = new Intent(ShomalActivity.this,MainActivity.class);
                startActivity(intent_home);
                break;

            case R.id.ki_sh:

                Intent intent_kish = new Intent(ShomalActivity.this , KishActivity.class);
                startActivity(intent_kish);
                break;


        }

    }
}
