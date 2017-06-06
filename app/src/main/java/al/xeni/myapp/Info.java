package al.xeni.myapp;
import android.content.Context;
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

/**
 * Created by xh3n1 on 17-05-30.
 */

public class Info  {
    private String info;
    private String photoPath;
    private String lat;
    private String longt;



    public Info (String info, String photopath, String lat, String longt){

        this.info=info;
        this.photoPath=photopath;
        this.lat=lat;
        this.longt=longt;


    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongt() {
        return longt;
    }

    public void setLongt(String longt) {
        this.longt = longt;
    }
}
