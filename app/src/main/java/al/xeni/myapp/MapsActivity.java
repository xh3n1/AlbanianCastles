package al.xeni.myapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements GoogleMap.OnMarkerClickListener, OnMapReadyCallback {

    private GoogleMap mMap;

    private static final LatLng Rozafa = new LatLng(42.046536, 19.493587);
    private static final LatLng Berati = new LatLng(40.708763, 19.945592);
    private static final LatLng Kruja = new LatLng(41.506960, 19.794273);
    private static final LatLng Lezha = new LatLng(41.783994, 19.649385);
    private static final LatLng Petrela = new LatLng(41.255190, 19.854334);


    private static final LatLng Gjirokastra = new LatLng(40.073796, 20.140413);
    private static final LatLng Tepelena = new LatLng(40.299623, 20.021474);
    private static final LatLng Rodoni = new LatLng(41.585806, 19.448150);
    private static final LatLng Sebaste = new LatLng(41.628419, 19.727894);
    private static final LatLng Preza = new LatLng(41.431560, 19.672333);

    private static final LatLng PortoPalermo = new LatLng(40.062503, 19.790611);
    private static final LatLng Peqin= new LatLng(41.044983, 19.749765);
    private static final LatLng Dibra= new LatLng(41.748982, 20.251328);
    private static final LatLng Tirana = new LatLng(41.32643, 19.82207);
    private static final LatLng Drishti = new LatLng(42.125143, 19.611873);




    private Marker mRozafa;
    private Marker mBerati;
    private Marker mKruja;
    private Marker mLezha;
    private Marker mGjirokastra;
    private Marker mTepelena;
    private Marker mRodoni;
    private Marker mSebaste;
    private Marker mPreza;
    private Marker mPortoPalermo;
    private Marker mPeqin;
    private Marker mDibra;

    private Marker mTirana;

    private Marker mDrishti;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);


        mapFragment.getMapAsync(this);

    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add some markers to the map, and add a data object to each marker.
        mRozafa = mMap.addMarker(new MarkerOptions()
                .position(Rozafa)
                .title("Kalaja e Rozafes")
                .snippet("Kalaja e Rozafatit është e ngritur në hyrje të qytetit të Shkodrës.") );
        mRozafa.setTag(0);

        mBerati = mMap.addMarker(new MarkerOptions()
                .position(Berati)
                .title("Kalaja e Beratit"));
        mBerati.setTag(0);

        mKruja = mMap.addMarker(new MarkerOptions()
                .position(Kruja)
                .title("Kalaja e Krujes"));
        mKruja.setTag(0);

        mLezha = mMap.addMarker(new MarkerOptions()
                .position(Lezha)
                .title("Kalaja e Lezhes"));
        mLezha.setTag(0);

        mPeqin = mMap.addMarker(new MarkerOptions()
                .position(Peqin)
                .title("Kalaja e Peqinit"));
        mPeqin.setTag(0);

        mPortoPalermo = mMap.addMarker(new MarkerOptions()
                .position(PortoPalermo)
                .title("Kalaja e Ali Pashes"));
        mPortoPalermo.setTag(0);

        mRodoni= mMap.addMarker(new MarkerOptions()
                .position(Rodoni)
                .title("Kalaja e Rodonit"));
        mRodoni.setTag(0);


        mPreza = mMap.addMarker(new MarkerOptions()
                .position(Preza)
                .title("Kalaja e Prezes"));
        mPreza.setTag(0);


        mGjirokastra= mMap.addMarker(new MarkerOptions()
                .position(Gjirokastra)
                .title("Kalaja e Argjirosë"));
        mGjirokastra.setTag(0);


        mDibra= mMap.addMarker(new MarkerOptions()
                .position(Dibra)
                .title("Kalaja e Skënderbeut"));
        mDibra.setTag(0);


        mTepelena= mMap.addMarker(new MarkerOptions()
                .position(Tepelena)
                .title("Kalaja e Tepelenes"));
        mTepelena.setTag(0);


        mTirana= mMap.addMarker(new MarkerOptions()
                .position(Tirana)
                .title("Kalaja e Tirana"));
        mTirana.setTag(0);



        mSebaste= mMap.addMarker(new MarkerOptions()
                .position(Sebaste)
                .title("Kalaja e Sebastes"));
        mSebaste.setTag(0);


        mDrishti= mMap.addMarker(new MarkerOptions()
                .position(Drishti)
                .title("Kalaja e Drishtit"));
        mDrishti.setTag(0);









        // Set a listener for marker click.
        mMap.setOnMarkerClickListener(this);
    }

    /** Called when the user clicks a marker. */
    @Override
    public boolean onMarkerClick(final Marker marker) {

        // Retrieve the data from the marker.
        Integer clickCount = (Integer) marker.getTag();

        // Check if a click count was set, then display the click count.
        if (clickCount != null) {
            clickCount = clickCount + 1;
            marker.setTag(clickCount);
            Toast.makeText(this,
                    marker.getTitle() +
                            " është klikuar " + clickCount + " herë.",
                    Toast.LENGTH_SHORT).show();
        }

        // Return false to indicate that we have not consumed the event and that we wish
        // for the default behavior to occur (which is for the camera to move such that the
        // marker is centered and for the marker's info window to open, if it has one).
        return false;
    }

}

