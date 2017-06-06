package al.xeni.myapp;

import android.app.Activity;

import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;



import android.widget.ListView;

import android.widget.ListAdapter;
import android.widget.Button;

import static android.R.attr.button;


public class MainActivity extends Activity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] kala = {"Kalaja e Beratit",
                "Kalaja e Durrësit",
                "Kalaja e Argjirosë",
                "Kalaja e Krujes",
                "Kalaja e Lezhes",
                "Kalaja e Petreles",
                "Kalaja e Rozafes",
                "Kalaja e Ali Pashes",
                "Kalaja e Rodonit ",
                "Kalaja e Tiranes",
                "Kalaja e Prezes",
                "Kalaja e Drishtit",
                "Kalaja e Rozafes",
                "Kalaja e Peqinit"

                };

        Integer[] imageId={
                R.drawable.berati,
                R.drawable.durresi,
                R.drawable.gjirokastra,
                R.drawable.kruja,
                R.drawable.lezha,
                R.drawable.petrela,
                R.drawable.shkodra,
                R.drawable.tepelena
        };

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button2);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                //myIntent=new Intent(Intent.ACTION_VIEW);
                //myIntent.setData(Uri.parse("geo: 19.0 20.0"));

                startActivity(myIntent);
            }
        });



        ListAdapter adapter = new customadapter(this, kala);

        ListView kalalistView = (ListView) findViewById(R.id.listid);
        kalalistView.setAdapter(adapter);
        kalalistView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                    @Override
                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String kala = String.valueOf(parent.getItemIdAtPosition(position));


            }



                }

        );

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);

    }

    public void setmap (View view) {
        Intent intent=null;
        intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo: 19.0 20.0"));
        startActivity(intent); }

}


