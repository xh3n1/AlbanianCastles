package al.xeni.myapp;

/**
 * Created by xh3n1 on 17-05-25.
 */
import android.app.Activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.ListAdapter;
import android.widget.TextView;

import static android.graphics.Color.*;

class customadapter extends ArrayAdapter<String>{

     customadapter( Context context,  String[] kala) {
        super(context, R.layout.custom_row, kala);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
     LayoutInflater kalaInflator= LayoutInflater.from(getContext());
        View customview= kalaInflator.inflate(R.layout.custom_row,parent,false);
        String kalaitem= getItem(position);

        TextView kalatext = (TextView) customview.findViewById(R.id.kalatext);


        kalatext.setText(kalaitem);
        kalatext.setTextColor(WHITE);

        return customview;
    }


}
