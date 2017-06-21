package al.xeni.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

public class Articles extends AppCompatActivity {


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_kalate, menu);


        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                Intent mymapIntent = new Intent(Articles.this,
                        MainActivity.class);
                //myIntent=new Intent(Intent.ACTION_VIEW);
                //myIntent.setData(Uri.parse("geo: 19.0 20.0"));

                startActivity(mymapIntent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_view);
//        Info sel = new Info();
//        sel.setName("Voskopojë");

        final Info sel = (Info) getIntent().getSerializableExtra("selCastle");

        TextView title= (TextView)findViewById(R.id.titulliID);
        title.setText(sel.getName());
        TextView pershkrimi= (TextView)findViewById(R.id.descriptionID);
        pershkrimi.setText(sel.getInfo());
        ImageView foto=(ImageView)findViewById(R.id.photoID);
        foto.setImageResource(sel.getPhotoPath());
        ImageButton ytbutton= (ImageButton)findViewById(R.id.videoButton);
        ytbutton.setImageResource(R.drawable.video);
        ImageButton mapButton=(ImageButton)findViewById(R.id.mapButton) ;
        mapButton.setImageResource(R.drawable.map);


        mapButton.setOnClickListener(new View.OnClickListener(){
            // When the button is pressed/clicked, it will run the code below
            @Override
            public void onClick(View view){
                // Intent is what you use to start another activity
                Intent mapIntent = new Intent(Articles.this, MapsActivity.class);
                mapIntent.putExtra("mapId",sel.getId());
                startActivity(mapIntent);
            }
        });



        ytbutton.setOnClickListener(new View.OnClickListener(){
            // When the button is pressed/clicked, it will run the code below
            @Override
            public void onClick(View view){



            // Intent is what you use to start another activity
            Intent myIntent = new Intent(Articles.this, YoutubeActivity.class);
                myIntent.putExtra("videoId",sel.getVideoId());
            startActivity(myIntent);
        }
    });


    }

}
