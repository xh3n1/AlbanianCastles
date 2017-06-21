package al.xeni.myapp;

import android.content.Intent;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

public class MapsActivity extends AppCompatActivity implements
        GoogleMap.OnMarkerClickListener,
        GoogleMap.OnInfoWindowClickListener,
                OnMapReadyCallback {

    private GoogleMap mMap;

    public static final LatLng Rozafa = new LatLng(42.046536, 19.493587);
    public static final LatLng Berati = new LatLng(40.708763, 19.945592);
    public static final LatLng Borshi = new LatLng(40.069810, 19.856073);

    public static final LatLng Dajti = new LatLng(41.359778, 19.915417);

    public static final LatLng Delvina = new LatLng(39.946833, 20.090722);

    public static final LatLng Dorzi= new LatLng(41.226275, 19.743504);

    public static final LatLng Durres= new LatLng(41.313081, 19.443839);
    public static final LatLng Gjonbocari= new LatLng(40.311125, 19.502465);

    public static final LatLng Ishmi= new LatLng(41.5392693,19.5947755);

    public static final LatLng Kanina= new LatLng(40.444546, 19.521446);

    public static final LatLng Kelcyra= new LatLng(40.308711, 20.183510);

    public static final LatLng Kruja = new LatLng(41.506960, 19.794273);
    public static final LatLng Himara = new LatLng(40.117971, 19.731692);
    public static final LatLng Lekuresi = new LatLng(39.866108, 20.025668);
    public static final LatLng Lezha = new LatLng(41.783994, 19.649385);
    public static final LatLng Pogradeci = new LatLng(40.908583, 20.646188);
    public static final LatLng Peqini = new LatLng(41.044959, 19.749711);
    public static final LatLng Petralba = new LatLng(41.648253, 20.188444);
    public static final LatLng Petrela = new LatLng(41.255190, 19.854334);

    public static final LatLng Varoshi = new LatLng(41.247314, 19.648283);

    public static final LatLng Gjirokastra = new LatLng(40.073796, 20.140413);
    public static final LatLng Tepelena = new LatLng(40.299623, 20.021474);
    public static final LatLng Rodoni = new LatLng(41.585806, 19.448150);
    public static final LatLng Sebaste = new LatLng(41.628419, 19.727894);
    public static final LatLng Preza = new LatLng(41.431560, 19.672333);

    public static final LatLng PortoPalermo = new LatLng(40.062503, 19.790611);
    public static final LatLng Peqin= new LatLng(41.044983, 19.749765);
    public static final LatLng Dibra= new LatLng(41.748982, 20.251328);
    public static final LatLng Tirana = new LatLng(41.32643, 19.82207);
    public static final LatLng Drishti = new LatLng(42.125143, 19.611873);
    public static final LatLng Zgerdheshi = new LatLng(41.47575,19.777347);



    private Marker mPetralba;
    private Marker mPogradeci;
    private Marker mHimara;
    private Marker mLekuresi;
    private Marker mkelcyra;
    private Marker mDorzi;
    private Marker mKanina;
    private Marker mIshmi;
    private Marker mGjonBocari;
    private Marker mDurres;
    private Marker mDelvina;
    private Marker mDajti;
    private Marker mBorshi;
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
    private Marker mPetrela;
    private Marker mTirana;
    private Marker mDrishti;
    private Marker mZgerdheshi;
    private Marker mVaroshi;
    private HashMap<Marker, Info> eventMarkerMap;


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_kalate, menu);


        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                Intent mymapIntent = new Intent(MapsActivity.this,
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
if (getIntent().getSerializableExtra("mapId")==null){
        // Add some markers to the map, and add a data object to each marker.
        mRozafa = mMap.addMarker(new MarkerOptions()
                .position(Rozafa)
                .title("Kalaja e Rozafes")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.shkodra))
                .snippet("Kalaja e Rozafatit është e ngritur në hyrje të qytetit të Shkodrës."));

        mRozafa.setTag(MainActivity.castles.get(23));
        mDorzi = mMap.addMarker(new MarkerOptions()
                .position(Dorzi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.dorzi))
                .title("Kalaja e Dorzit"));
        mDorzi.setTag(MainActivity.castles.get(4));
        mkelcyra = mMap.addMarker(new MarkerOptions()
                .position(Kelcyra)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.kelcyra))
                .title("Kalaja e Këlcyrës"));
        mkelcyra.setTag(MainActivity.castles.get(11));
        mLekuresi = mMap.addMarker(new MarkerOptions()
                .position(Lekuresi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.lekuresi))
                .title("Kalaja  Lëkurësit"));
        mLekuresi.setTag(MainActivity.castles.get(14));
        mHimara = mMap.addMarker(new MarkerOptions()
                .position(Himara)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.himara))
                .title("Kalaja e Himarës"));
        mHimara.setTag(MainActivity.castles.get(13));
        mPogradeci = mMap.addMarker(new MarkerOptions()
                .position(Pogradeci)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.pogradeci))
                .title("Kalaja e Pogradecit"));
        mPogradeci.setTag(MainActivity.castles.get(16));
        mKanina = mMap.addMarker(new MarkerOptions()
                .position(Kanina)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.kanina))
                .title("Kalaja e Kanines"));
        mKanina.setTag(MainActivity.castles.get(10));
        mPetralba = mMap.addMarker(new MarkerOptions()
                .position(Petralba)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.petralba))
                .title("Kalaja e Petralbes"));
        mPetralba.setTag(MainActivity.castles.get(18));
        mIshmi = mMap.addMarker(new MarkerOptions()
                .position(Ishmi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ishmi))
                .title("Kalaja e Ishmit"));
        mIshmi.setTag(MainActivity.castles.get(9));
        mDurres = mMap.addMarker(new MarkerOptions()
                .position(Durres)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.durresi))
                .title("Kalaja e Durrësit"));
        mDurres.setTag(MainActivity.castles.get(6));
        mDelvina = mMap.addMarker(new MarkerOptions()
                .position(Delvina)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.delvina))
                .title("Kalaja e Delvines"));
        mDelvina.setTag(MainActivity.castles.get(3));
        mZgerdheshi = mMap.addMarker(new MarkerOptions()
                .position(Zgerdheshi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.zgerdheshi))
                .title("Kalaja e Zgërdheshit"));
        mZgerdheshi.setTag(MainActivity.castles.get(28));
        mBorshi = mMap.addMarker(new MarkerOptions()
                .position(Borshi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.borshi))
                .title("Kalaja e Borshit"));
        mBorshi.setTag(MainActivity.castles.get(1));
        mDajti = mMap.addMarker(new MarkerOptions()
                .position(Dajti)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.dajti))
                .title("Kalaja e Dajtit"));
        mDajti.setTag(MainActivity.castles.get(2));
        mVaroshi = mMap.addMarker(new MarkerOptions()
                .position(Varoshi)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.varoshi))
                .title("Kalaja e Varoshit"));
        mVaroshi.setTag(MainActivity.castles.get(27));
        mGjonBocari = mMap.addMarker(new MarkerOptions()
                .position(Gjonbocari)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.gjonbocari))
                .title("Kalaja e Gjon Boçarit"));
        mGjonBocari.setTag(MainActivity.castles.get(8));

        mBerati = mMap.addMarker(new MarkerOptions()
                .position(Berati)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.berati))
                .title("Kalaja e Beratit"));
        mBerati.setTag(MainActivity.castles.get(0));

        mKruja = mMap.addMarker(new MarkerOptions()
                .position(Kruja)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.kruja))
                .title("Kalaja e Krujes"));
        mKruja.setTag(MainActivity.castles.get(12));

        mLezha = mMap.addMarker(new MarkerOptions()
                .position(Lezha)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.lezha))
                .title("Kalaja e Lezhes"));
        mLezha.setTag(MainActivity.castles.get(15));

        mPeqin = mMap.addMarker(new MarkerOptions()
                .position(Peqin)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.peqini))
                .title("Kalaja e Peqinit"));
        mPeqin.setTag(MainActivity.castles.get(17));

    mPetrela= mMap.addMarker(new MarkerOptions()
            .position(Petrela)
            .icon(BitmapDescriptorFactory.fromResource(R.mipmap.petrela))
            .title("Kalaja e Petreles"));


    // set object as tag
    mPetrela.setTag(MainActivity.castles.get(19));

        mPortoPalermo = mMap.addMarker(new MarkerOptions()
                .position(PortoPalermo)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.portopalermo))
                .title("Kalaja e Porto Palermos"));
        mPortoPalermo.setTag(MainActivity.castles.get(20));

        mRodoni = mMap.addMarker(new MarkerOptions()
                .position(Rodoni)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.rodoni))
                .title("Kalaja e Rodonit"));
        mRodoni.setTag(MainActivity.castles.get(22));


        mPreza = mMap.addMarker(new MarkerOptions()
                .position(Preza)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.preza))
                .title("Kalaja e Prezes"));
        mPreza.setTag(MainActivity.castles.get(21));


        mGjirokastra = mMap.addMarker(new MarkerOptions()
                .position(Gjirokastra)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.gjirokastra))
                .title("Kalaja e Argjirosë"));
        mGjirokastra.setTag(MainActivity.castles.get(7));


        mTepelena = mMap.addMarker(new MarkerOptions()
                .position(Tepelena)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.tepelena))
                .title("Kalaja e Tepelenes"));
        mTepelena.setTag(MainActivity.castles.get(25));


        mTirana = mMap.addMarker(new MarkerOptions()
                .position(Tirana)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.tirana))
                .title("Kalaja e Tirana"));
        mTirana.setTag(MainActivity.castles.get(26));


        mSebaste = mMap.addMarker(new MarkerOptions()
                .position(Sebaste)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.sebaste))
                .title("Kalaja e Sebastes"));
        mSebaste.setTag(MainActivity.castles.get(24));


        mDrishti = mMap.addMarker(new MarkerOptions()
                .position(Drishti)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.drishti))
                .title("Kalaja e Drishtit"));


        // set object as tag
        mDrishti.setTag(MainActivity.castles.get(5));


        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {

            @Override
            public boolean onMarkerClick(Marker marker) {

                Intent intent = new Intent(MapsActivity.this, Articles.class);
                intent.putExtra("vendodhja", marker.getId());
                startActivity(intent);
                return true;
            }

        });


        // Vendos zoomin e hartes dhe koordinaten
        mMap.setOnMarkerClickListener(this);

        mMap.setOnInfoWindowClickListener(this);


    }else{
    int kalaja= (int) getIntent().getSerializableExtra("mapId");
    if (kalaja==0) {
        mBerati = mMap.addMarker(new MarkerOptions()
                .position(Berati)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Beratit"));


    // set object as tag
    mBerati.setTag(MainActivity.castles.get(0));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Berati);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    if (kalaja==1) {
        mBorshi = mMap.addMarker(new MarkerOptions()
                .position(Borshi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Borshit"));


        // set object as tag
        mBorshi.setTag(MainActivity.castles.get(1));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Borshi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(10);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==2) {
        mDajti = mMap.addMarker(new MarkerOptions()
                .position(Dajti)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Dajtit"));


        // set object as tag
        mDajti.setTag(MainActivity.castles.get(2));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Dajti);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==3) {
        mDelvina = mMap.addMarker(new MarkerOptions()
                .position(Delvina)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Delvines"));


        // set object as tag
        mDelvina.setTag(MainActivity.castles.get(3));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Delvina);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if(kalaja==4) {
        mDorzi = mMap.addMarker(new MarkerOptions()
                .position(Dorzi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Dorzit"));


        // set object as tag
        mDorzi.setTag(MainActivity.castles.get(4));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Dorzi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==5) {
        mDrishti = mMap.addMarker(new MarkerOptions()
                .position(Drishti)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Drishti"));


        // set object as tag
        mDrishti.setTag(MainActivity.castles.get(5));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Drishti);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==6) {
        mDurres = mMap.addMarker(new MarkerOptions()
                .position(Durres)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Durresit"));


        // set object as tag
        mDurres.setTag(MainActivity.castles.get(6));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Durres);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==7) {
        mGjirokastra = mMap.addMarker(new MarkerOptions()
                .position(Gjirokastra)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Gjirokastres"));


        // set object as tag
        mGjirokastra.setTag(MainActivity.castles.get(7));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Gjirokastra);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==8) {
        mGjonBocari = mMap.addMarker(new MarkerOptions()
                .position(Gjonbocari)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Gjon Boçarit"));


        // set object as tag
        mGjonBocari.setTag(MainActivity.castles.get(8));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Gjonbocari);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==9) {
        mIshmi = mMap.addMarker(new MarkerOptions()
                .position(Ishmi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Ishmit"));


        // set object as tag
        mIshmi.setTag(MainActivity.castles.get(9));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Ishmi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

            else if (kalaja==10) {
        mKanina = mMap.addMarker(new MarkerOptions()
                .position(Kanina)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Kanines"));


        // set object as tag
        mKanina.setTag(MainActivity.castles.get(10));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Kanina);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}


    else if (kalaja==11) {
        mkelcyra = mMap.addMarker(new MarkerOptions()
                .position(Kelcyra)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Këlcyres"));


        // set object as tag
        mkelcyra.setTag(MainActivity.castles.get(11));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Kelcyra);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==12) {
        mKruja = mMap.addMarker(new MarkerOptions()
                .position(Kruja)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Krujes"));


        // set object as tag
        mKruja.setTag(MainActivity.castles.get(12));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Kruja);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==13) {
        mHimara = mMap.addMarker(new MarkerOptions()
                .position(Himara)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Himares"));


        // set object as tag
        mHimara.setTag(MainActivity.castles.get(13));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Himara);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==14) {
        mLekuresi = mMap.addMarker(new MarkerOptions()
                .position(Lekuresi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Lekuresit"));


        // set object as tag
        mLekuresi.setTag(MainActivity.castles.get(14));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Lekuresi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==15) {
        mLezha = mMap.addMarker(new MarkerOptions()
                .position(Lezha)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Lezhes"));


        // set object as tag
        mLezha.setTag(MainActivity.castles.get(15));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Lezha);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==16) {
        mPogradeci = mMap.addMarker(new MarkerOptions()
                .position(Pogradeci)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Pogradecit"));


        // set object as tag
        mPogradeci.setTag(MainActivity.castles.get(16));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Pogradeci);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==20) {
        mPortoPalermo = mMap.addMarker(new MarkerOptions()
                .position(PortoPalermo)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Porto Palermos"));


        // set object as tag
        mPortoPalermo.setTag(MainActivity.castles.get(20));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(PortoPalermo);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==17) {
        mPeqin = mMap.addMarker(new MarkerOptions()
                .position(Peqin)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Peqinit"));


        // set object as tag
        mPeqin.setTag(MainActivity.castles.get(17));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Peqin);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==18) {
        mPetralba = mMap.addMarker(new MarkerOptions()
                .position(Petralba)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Petralbes"));


        // set object as tag
        mPetralba.setTag(MainActivity.castles.get(18));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Petralba);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==19) {
         mPetrela= mMap.addMarker(new MarkerOptions()
                .position(Petrela)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Petreles"));


        // set object as tag
        mPetrela.setTag(MainActivity.castles.get(19));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Petrela);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==20) {
        mPortoPalermo = mMap.addMarker(new MarkerOptions()
                .position(PortoPalermo)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Porto Palermos"));


        // set object as tag
        mPortoPalermo.setTag(MainActivity.castles.get(20));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(PortoPalermo);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==21) {
        mPreza = mMap.addMarker(new MarkerOptions()
                .position(Preza)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Prezes"));


        // set object as tag
        mPreza.setTag(MainActivity.castles.get(21));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Preza);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==22) {
        mRodoni = mMap.addMarker(new MarkerOptions()
                .position(Rodoni)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Rodonit"));


        // set object as tag
        mRodoni.setTag(MainActivity.castles.get(22));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Rodoni);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==23) {
        mRozafa = mMap.addMarker(new MarkerOptions()
                .position(Rozafa)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Rozafes"));


        // set object as tag
        mRozafa.setTag(MainActivity.castles.get(23));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Rozafa);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==24) {
        mSebaste = mMap.addMarker(new MarkerOptions()
                .position(Sebaste)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Sebastes"));


        // set object as tag
        mSebaste.setTag(MainActivity.castles.get(24));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Sebaste);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==25) {
        mTepelena = mMap.addMarker(new MarkerOptions()
                .position(Tepelena)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Tepelenes"));


        // set object as tag
        mTepelena.setTag(MainActivity.castles.get(25));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Tepelena);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==26) {
        mTirana = mMap.addMarker(new MarkerOptions()
                .position(Tirana)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Tiranes"));


        // set object as tag
        mTirana.setTag(MainActivity.castles.get(26));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Tirana);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}
    else if (kalaja==27) {
        mVaroshi = mMap.addMarker(new MarkerOptions()
                .position(Varoshi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Varoshit"));


        // set object as tag
        mVaroshi.setTag(MainActivity.castles.get(27));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Varoshi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}

    else if (kalaja==28) {
        mZgerdheshi = mMap.addMarker(new MarkerOptions()
                .position(Zgerdheshi)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.castleicon))
                .title("Kalaja e Zgerdheshit"));


        // set object as tag
        mZgerdheshi.setTag(MainActivity.castles.get(28));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(Zgerdheshi);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);}




















    mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {

        @Override
        public boolean onMarkerClick(Marker marker) {

            Intent intent = new Intent(MapsActivity.this, Articles.class);
            intent.putExtra("vendodhja", marker.getId());
            startActivity(intent);
            return true;
        }

    });


    // Vendos zoomin e hartes dhe koordinaten
    mMap.setOnMarkerClickListener(this);

    mMap.setOnInfoWindowClickListener(this);

}

    CameraUpdate center=
                CameraUpdateFactory.newLatLng(Tirana);
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(8);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        // to retrieve the marker
        Info currInfo = (Info) marker.getTag();// Type cast to your object type;
        Intent goToInfo = new Intent(MapsActivity.this, Articles.class);
        goToInfo.putExtra("selCastle", currInfo);

        startActivity(goToInfo);
    }


    /** Called when the user clicks a marker. */
    @Override
    public boolean onMarkerClick(final Marker marker) {

        // Retrieve the data from the marker.


        // Return false to indicate that we have not consumed the event and that we wish
        // for the default behavior to occur (which is for the camera to move such that the
        // marker is centered and for the marker's info window to open, if it has one).
        return false;
    }

}

