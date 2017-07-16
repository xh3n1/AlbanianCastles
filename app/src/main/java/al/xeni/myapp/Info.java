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

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by xh3n1 on 17-05-30.
 */

public class Info implements Serializable {
    private int id;
    private String info;
    private String photoPath;
    private transient LatLng latLng;
    private String videoId;
    private String infoEn;
    private String nameEn;
    private String name;
    private String photoPathSmall;


    public Info(){}


    public Info (int id, String info, String photoPath, String photoPathSmall, LatLng latLng, String name, String videoId){

        this.info=info;
        this.photoPath=photoPath;
        this.photoPathSmall=photoPathSmall;
        this.latLng=latLng;
        this.videoId=videoId;


        this.id=id;
        this.name=name;



    }
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public int getId() {
        return id;
    }

    public String getPhotoPathSmall() {
        return photoPathSmall;
    }

    public void setPhotoPathSmall(String photoPathSmall) {
        this.photoPathSmall = photoPathSmall;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getInfoEn() {
        return infoEn;
    }

    public void setInfoEn(String infoEn) {
        this.infoEn = infoEn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
