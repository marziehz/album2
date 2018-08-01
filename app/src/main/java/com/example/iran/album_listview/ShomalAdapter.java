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

public class ShomalAdapter extends ArrayAdapter<String> {

    public ShomalAdapter(@NonNull Context context, @NonNull List<String> names_shomal) {
        super(context, 0, names_shomal);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }


        String name = getItem(position);
        TextView txt_sh = convertView.findViewById(R.id.text);
        txt_sh.setText(name);


        ImageView image = convertView.findViewById(R.id.image);

        switch (position){

            case 0 :
                image.setImageResource(R.drawable.castle01);
                break;
            case 1:
                image.setImageResource(R.drawable.castle02);
                break;
            case 2 :
                image.setImageResource(R.drawable.castle03);
                break;

            case 3 :
                image.setImageResource(R.drawable.castle04);
                break;
            case 4:
                image.setImageResource(R.drawable.castle05);
                break;
            case 5 :
                image.setImageResource(R.drawable.masole01);
                break;

            case 6 :
                image.setImageResource(R.drawable.masole02);
                break;
            case 7:
                image.setImageResource(R.drawable.masole03);
                break;



        }


        return  convertView;

    }
}
