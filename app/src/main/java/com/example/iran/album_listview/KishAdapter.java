package com.example.iran.album_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KishAdapter extends ArrayAdapter<String> {

    public KishAdapter(@NonNull Context context, @NonNull List names_kish) {
        super(context, 0, names_kish);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


        String S = getItem(position);

        TextView text_kish = convertView.findViewById(R.id.text);
        ImageView image_kish = convertView.findViewById(R.id.image);

        text_kish.setText(S);

        switch (position){

            case 0 :
                image_kish.setImageResource(R.drawable.kish01);
                break;
            case 1:
                image_kish.setImageResource(R.drawable.kish02);
                break;
            case 2 :
                image_kish.setImageResource(R.drawable.kish03);
                break;

            case 3 :
                image_kish.setImageResource(R.drawable.kish04);
                break;
            case 4:
                image_kish.setImageResource(R.drawable.kish05);
                break;
            case 5:
                image_kish.setImageResource(R.drawable.kish06);
                break;

            case 6 :
                image_kish.setImageResource(R.drawable.kish07);
                break;
            case 7:
                image_kish.setImageResource(R.drawable.kish08);
                break;
            case 8 :
                image_kish.setImageResource(R.drawable.kish09);
                break;


        }


        return  convertView;


    }
}
