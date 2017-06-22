package al.xeni.myapp;

/**
 * Created by xh3n1 on 17-05-25.
 */


import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;

import android.widget.ImageView;

import android.widget.TextView;

import java.util.List;

import static android.graphics.Color.*;

class CustomAdapter extends ArrayAdapter<Info>{

     CustomAdapter(Context context, List<Info> castles) {
        super(context, R.layout.custom_row, castles);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
     LayoutInflater kalaInflator= LayoutInflater.from(getContext());
        View customview= kalaInflator.inflate(R.layout.custom_row,parent,false);
        Info kalaitem= getItem(position);

        TextView kalatext = (TextView) customview.findViewById(R.id.kalatext);


        kalatext.setText(kalaitem.getName());
        kalatext.setTextColor(WHITE);
        ImageView img =(ImageView)customview.findViewById(R.id.imgList);
        img.setImageResource(kalaitem.getPhotoPathSmall());


        TextView shortDescription= (TextView)customview.findViewById(R.id.shortDescription);
        shortDescription.setText(kalaitem.getInfo().substring(0,120)+"...");



        return customview;
    }


}
