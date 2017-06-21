package al.xeni.myapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xh3n1 on 17-06-16.
 */

public class Video {
    private List<String> youtube = new ArrayList<>();
    private int id;

    public Video(){

    }

    public Video(List<String> youtube, int id) {
        this.youtube = youtube;
        this.id = id;
    }

    public List<String> getYoutube() {
        return youtube;
    }

    public void setYoutube(List<String> youtube) {
        this.youtube = youtube;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
