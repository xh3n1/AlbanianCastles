package al.xeni.myapp;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


import android.widget.ImageButton;
import android.widget.ListView;

import android.widget.ListAdapter;
import android.widget.Button;

import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private FirebaseAnalytics mFirebaseAnalytics;
    public static List<Info> castles = new ArrayList<>();
    public static List<Video> videos = new ArrayList<>();

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.map:
                Intent mymapIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
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
// Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        String[] kala = {


                "Kalaja e Beratit",
                "Kalaja e Borshit",
                "Kalaja e Dajtit",
                "Kalaja e Delvines",
                "Kalaja e Dorëzit",
                "Kalaja e Drishtit",
                "Kalaja e Durrësit",
                "Kalaja e Gjirokastres",
                "Kalaja e Gjon Boçarit",
                "Kalaja e Ishmit",
                "Kalaja e Kanines",
                "Kalaja e Këlcyres",
                "Kalaja e Krujes",
                "Kalaja e Himares",
                "Kalaja e Lekuresit",
                "Kalaja e Lezhes",
                "Kalaja e Pogradecit",
                "Kalaja e Peqinit",
                "Kalaja e Petralbes",
                "Kalaja e Petreles",
                "Kalaja e Porto Palermos ",
                "Kalaja e Prezes",
                "Kalaja e Rodonit ",
                "Kalaja e Rozafes",
                "Kalaja e Sebastes",
                "Kalaja e Tepelenes",
                "Kalaja e Tiranes",
                "Kalaja e Varoshit",
                "Kalaja e Zgërdheshit", //29 kala gjithsej

        };
       // Castles liste me objekte info
        String videoId = "";
        castles = new ArrayList<>();
        for (int i=0; i<29; i++){
            Info a= new Info();
            if ( i==0){
                String infoberati="Kalaja e Beratit eshte ngritur në një kodër 187 metra të lartë, në " +
                        "të majtë të grykës së lumit Osum. Fillimisht, një vendbanim protourban, " +
                        "në shekullin e VII-V p.e.s, si një pikë strategjike e rëndesishme, ajo u shndërrua " +
                        "në qytet kështjellë me mure që arrinin në gjatësi deri në 1.400 metra dhe me një " +
                        "sipërfaqe prej 10 ha. " +
                        "\n  Burimet historike deshmojne se prej këtij viti kalaja e Beratit ka qenë objekt " +
                        "i sulmeve të ndryshme. ";

                videoId="QbGkxnHUANg";



                a=new Info( 0,  infoberati,  R.drawable.berati,R.drawable.berati_sm,   MapsActivity.Berati,  kala[i], videoId);
            }else if ( i==1) {
                String infoborshi="Kalaja e Borshit ndodhet rreth 3 km në VP të fshatit Borsh, Sarandë." +
                        " Ajo ngrihet mbi një kodër, e cila përfundon në majë me një kreshtë shkëmbore dhe zë një " +
                        "pozicion qendror kundrejt qytetit antik të Borshit, i cili shtrihej dikur në shpatet e kësaj " +
                        "kodre.\n  Kalaja ka një pozitë të rëndësishme strategjike jo vetëm sepse ndodhet pranë detit" +
                        " por edhe pranë njërës nga dy grykat që përshkonin që në lashtësi malet Akrokeraune, " +
                        "në mesjetë të njohura si malet e Himarës, duke lidhur bregdetin me brendësinë e vendit." +
                        " Nëpërmjet “Grykës së Borshit” realizohej lidhja me Kalasën dhe Delvinën.";
                videoId="OAlkb1CDTKA";
                a=new Info( 1,  infoborshi,  R.drawable.borshi,R.drawable.borshi_sm,   MapsActivity.Borshi,  kala[i], videoId);
            }



             else if ( i==2) {
                String infodajti="Kalaja e Dajtit ndodhet në tarracën detare të Dajtit në lartësinë 1200" +
                        " mbi nivelin e detit, në shpatin perëndimor të malit të Dajtit, mbi një majë në të" +
                        " djathtë të rrugës që të çon nga Qafa e Priskës për në fushën e Dajtit.\n" +
                        "Mendohet se ajo mund të jetë një nga kalatë e ndërtuara nga perandori bizantin " +
                        "Justiniani (527- 566) dhe i përket gjysmës së shek.VI.\n Kalaja ka një sipërfaqe " +
                        "prej 1.12 ha, dhe në pjesën më të madhe të saj ajo është mjaft e pjerrët. " +
                        "Muret kanë qenë të detyruar të ndjekin formën e kodrës, duke formuar një " +
                        "trekëndësh i cili është forcuar në tre këndet me nga një kullë të rrumbullakët." +
                        " \nSipërfaqja e rrethuar nga këta mure është në pjesën më të madR.drawable.berati_sm;he mjaft e pjerrët " +
                        "dhe e mbuluar me shkëmbinj, vetëm në rrëzë të mureve dhe pjesën midis dy majave " +
                        "kjo është e përshtatshme për ndërtim banesash. Trashësia e mureve është e lidhur " +
                        "me cilësitë mbrojtëse të terrenit, atje ku terreni është shumë i pjerrët jepte " +
                        "mundësi mbrojtjeje edhe një mur jo i trashë, ndërsa në vendet pak të pjerrëta " +
                        "ekzistonte një mur i trashë. ";
                videoId = "";
                a=new Info( 2,  infodajti,  R.drawable.dajti, R.drawable.dajti_sm,  MapsActivity.Dajti,  kala[i], videoId);
            }
            else if ( i==3) {
                String infodelvina="Ndodhet në qytetin e Delvinës, në një pikë gjeografike që ka dominuar " +
                        "hyrjen nga treva e Gjirokastrës me anë të Qafës së Muzinës për në fushën e Vrinës." +
                        " Kështjella ka pasur një sipërfaqe prej 0.17 ha, ngrihej mbi një kurriz shkëmbor dhe " +
                        "dy rrugë ngjiteshin për tek ajo nga jugu dhe veriu. Nga anët e tjera rrethohet me dy" +
                        " përrenj.\n Fortifikimi përbëhej prej kështjellës dhe një muri parapritë në anën" +
                        " perëndimore. Vetë kështjella ka pasur trajtën e një gjysmë elipsi me drejtim " +
                        "perëndim – lindje dhe shfrytëzonte plotësisht mbrojten natyrale të terrenit. " +
                        "Balli lindor i murit i kundërvihej qafës. \n Në ekstremin perëndimor ajo mbrohej" +
                        " nga një kullë gjashtëkëndëshe dhe muri zgjatej në anën veriore deri te hyrja" +
                        "e kështjellës. Në jug muri ndjek konturin e greminës. Muri ballor pëson një thyerje" +
                        " dhe mbrohej prej dy kullave anësore, të cilat sëbashku me murin parapritë formojnë " +
                        "një kompleks mbrojtës. Mbrojtja e përgjithshme e kështjellës paraqet një rast unik " +
                        "për zonën.";

                a=new Info( 3,  infodelvina,  R.drawable.delvina,R.drawable.delvina_sm,   MapsActivity.Delvina,  kala[i], videoId);
            }
            else if ( i==4) {
                String infodorzi="Kalaja e Dorëzit ndodhet rreth 20 km në jug perëndim të Tiranës " +
                        "dhe rreth 5 km në lindje të Pezës. Ajo është më e vjetra në trevën e Tiranës." +
                        " Kjo kala i takon shekujve IX-IV para Krishtit, ndërsa ekspedita e parë " +
                        "arkeologjike drejt saj është kryer në vitin 1951. Rrënojat e saj mbulojnë " +
                        "një nga kuotat më të larta në vargun e kodrave të shkëputura nga malet e Krrabës" +
                        " në lartësinë 479 m nga niveli i detit. Mendohet që këtu të ketë qenë qyteza e " +
                        "Dimalit antik. \n Për ndërtimin kalasë është zgjedhur një pllajë e pjerrët ku afro" +
                        " gjysma nuk është e rrethuar me mur por është e mbrojtur nga shkëmbi natyral. " +
                        "Muri rrethues i saj, shtrihet në të gjithë pjesën jugore të një kodre shkëmbore " +
                        "dhe është afërsisht 300 m i gjatë, nga lindja në perëndim. \n Kalaja e Dorëzit " +
                        "paraqet një interes të veçantë për nga ana e teknikës së ndërtimit ku vihen re " +
                        "tre faza: faza e parë e ndërtuar me gurë të papunuar, faza e dytë me blloqe " +
                        "të gdhendur të vendosur në të thatë (periudha helenistike) dhe e treta " +
                        "që ndjek të njëjtën trase me të dytën ndërtuar me gurë të thyer të lidhur " +
                        "me llaç (antikiteti i vone, shek. IV-VI).  Në njërën anë të mureve," +
                        " mund të dallohet vendi ku duhet të ketë qenë hyrja për në kala, aty janë " +
                        "gjetur fragmente enësh. Fragmente muresh të tjera të një periudhe më të" +
                        " vonë, tregojnë e qyteti i hershëm ilir ka qenë i banuar deri në kohët e vona " +
                        "antike.";
                a=new Info( 4,  infodorzi,  R.drawable.dorzi,R.drawable.dorzi_sm,   MapsActivity.Dorzi,  kala[i], videoId);
            }

            else if ( i==5) {
                String infodrishti="Kalaja e Drishtit gjendet në një distancë prej 6 km nga Ura e Mesit mbi lumin Kir." +
                        " Fshati i sotëm ndodhet poshtë vendgërmimit të Drivastumit të lashtë. " +
                        "Ai u ngrit në periudhën romake si një vendbanim në rrugën Shkodër–Kosovë dhe në " +
                        "antikitetin e vonë ishte njëra prej fortesave zinxhir, të cilat mbronin Shkodrën." +
                        "\n Në shek IX, Drishti u kthye në një fortifikim të rëndësishëm të Mbretërise së Zetës " +
                        "dhe varej nga Dioqeza e Tivarit. Kalaja e Drishtit u ngrit në shek XIII si një fortesë " +
                        "bizantine. Gjate shekujve XIV-XV kalaja se bashku me qytetin kaloi nga njeri sundues " +
                        "tek tjetri, derisa me 1478 bie ne duart e osmaneve, te cilet u perpoqen ta meremetonin. ";
                a=new Info( 5,  infodrishti,  R.drawable.drishti,R.drawable.drishti_sm,   MapsActivity.Drishti,  kala[i], videoId);
            }
            else if ( i==6) {
                String infodurresi="Kalaja u ndërtua nga perandori i Perandorisë Bizantine Anastasi I cili origjinën" +
                        " nga Durrësi. Në atë kohë, Anastasius e bëri Durrësin një nga qytetet më të fortifikuara" +
                        " në Adriatik. Riparime të mureve janë kryer që prej tërmetit shkatërrimtar të vitit 1273. " +
                        "\n Mureve mesjetare aktualisht rreth 4.6 metra në lartësi dhe tri hyrjet e disa prej kullave " +
                        "të fortifikimit janë ruajtur në gati një të tretën e gjatësisë fillestare të qytetit kala. " +
                        "Kalaja u përforcuar me disa kulla roje nga Republika e Venedikut dhe gjatë pushtimit t" +
                        "ë Shqipërisë nga Perandoria Osmane muret u përforcuar." +

                        "\n" +
                        "Më 7 prill 1939, patriotët shqiptarë luftuan në muret e kalasë fashistët italian që pushtuan" +
                        " Shqipërinë. Në Durrës, një forcë prej vetëm 360 shqiptarë, kryesisht xhandarëve dhe banorë " +
                        "të qytetit, të udhëhequra nga Abaz Kupi, komandant i xhandarmërisë në Durrës," +
                        " dhe Mujo Ulqinaku, një zyrtar detarë, u përpoq për të ndalur përparimin e " +
                        "italianëve. \n Të armatosur vetëm me armë të vogla dhe tre automatikë, ata patën " +
                        "sukses në mbajtjen italianët në gji për disa orë deri sa një numër i madh " +
                        "i tankeve të lehta zbarkuan nga anijet detare të këtij të fundit. " +
                        "Pas kësaj, rezistenca zvogëluar dhe brenda pesë orëve Italia kishte pushtuar " +
                        "të gjithë qytetin ";
                videoId=" Kp29p9_RmUA";

                a=new Info( 6,  infodurresi,  R.drawable.durresi,R.drawable.durresi_sm,   MapsActivity.Durres,  kala[i], videoId);
            } else if ( i==7) {
                String infogjirokastra="Kalaja e Gjirokastrës si histori e lidhur me qytetin e Gjirokastrës," +
                        " përmendet për herë të parë si qytet dhe kështjellë në vitin 1336. Në këto vite," +
                        " ajo ishte qendra e feudalëve shqiptarë Zenevisë. Më vonë, gjatë sundimit" +
                        " të Gjin Bue Shpatës, ajo u përfshi në Despotatin e Epirit. \n E megjithatë historianë" +
                        " të ndryshëm mendojnë se ekzistenca e kalasë së gurtë është më e hershme. Sipas tyre," +
                        " kalaja ka pas dy faza ndërtimi, të cilat lidhen me periudhën para dhe pas Pashallëkut " +
                        "të Janinës dhe fortesave të Ali Pashë Tepelenës. \n Nga Kalaja mesjetare, ajo e para " +
                        "pushtimit të Ali Pashës, ruhen vetëm pak gjurmë pasi muret janë veshur deri në lartësi " +
                        "nga ndërtimet e reja. Ndërsa, kullat pjesërisht janë rrënuar dhe ripërshtatur. ";
                videoId="kXg7gDgooe4";
                a=new Info( 7,  infogjirokastra,  R.drawable.gjirokastra,R.drawable.gjirokastra_sm,   MapsActivity.Gjirokastra,  kala[i], videoId);
            } else if ( i==8) {
                String infogjonbocari="Ndodhet ne fshatin Tragjas dhe është e ndërtuar ne shekullin XVI - XVII." +
                        " Ka forme drejtkëndëshe me gjerësi muresh 1,25 metra dhe lartësi deri ne 5,5 metra.\n" +
                        "              ";
                videoId = "";
                a=new Info( 8,  infogjonbocari,  R.drawable.gjonbocari,R.drawable.gjonbocari_sm,   MapsActivity.Gjonbocari,  kala[i], videoId);

        } else if ( i==9) {
            String infoishmi=" Kalaja e Ishmit është një kala dhe monument i trashëgimisë kulturore në Ishëm, " +
                    "në qarkun e Durrësit, Shqipëri [1]. Ajo është ndërtuar nga viti 1572 deri në vitin 1574 nga osmanët." +
                    " Përballë hyrjes së kalasë është varros artisti shqiptar Ibrahim Kodra. Nga kodra ku ngrihet kalaja është i shikueshëm " +
                    "gjithashtu lumi Ishëm. ";

            a=new Info( 9,  infoishmi,  R.drawable.ishmi,R.drawable.ishmi_25,   MapsActivity.Ishmi,  kala[i], videoId);
        }

            else if ( i==10) {
                String infokanina=" Kalaja e Kaninës ndodhet 6 km larg nga qyteti i Vlorës. " +
                        "Kjo kala është përmendur që në shekullin IV. Megjithatë aty janë zbuluar gjurmë që prej " +
                        "periudhës ilire. Mendohet se është ndërtuar që në shek III. Gjurmë të mëpasme janë ato të " +
                        "periudhave bizantine, veneciane dhe turke.\n Kalaja është rindërtuar nga Justiniani në shek V" +
                        " dhe meremetuar nga sulltan Sulejmani më 1531. Kalaja ngrihet në majë të një kodre me lartësi" +
                        " 380 metra mbi nivelin e detit. Ajo ka një sipërfaqe prej 3.6 hektarësh. Prej këndej hapet " +
                        "një pamje mjaft e bukur drejt Vlorës dhe gjirit të saj.";

                a=new Info( 10,  infokanina,  R.drawable.kanina,R.drawable.kanina_sm,   MapsActivity.Kanina,  kala[i], videoId);
            } else if ( i==11) {
                String infokelcyra="Këlcyra e sotme është qyteza që ju njihni në rrethin e Përmetit përballë grykës së " +
                        "Këlcyrës, buzë bregut të djathtë të luginës së Vjosës. Por dikur ka qenë një pikë e rëndësishme kalimi," +
                        " që përmendet në librat e historisë që në shek. IV-III para Krishtit.\n" +
                        "Rreth kësaj kohe në një kodër të malit të Trebeshinit, u ngrit kështjella e Këlcyrës me mure blloqesh " +
                        "guri drejtkëndësh. Fortifikimet u rindërtuan në mesjetën paraosmane. Përmendet për herë të parë në" +
                        " dokumente të shkruara më 1272 me emrin Klausura.Rreth vitit 1335 përmendet kur e marrin " +
                        "kryengritësit arbëreshë. \n Në pjesën më të lartë të kodrës qenë edhe rrënojat e një kështjelle" +
                        " të periudhës së pushtimit osman. Në regjistrin osman të v. 1431 shënohet si qendër e vilajetit të Këlcyrës." +
                        " Gjatë periudhës së Rilindjes Kombëtare, në këtë zonë, zhvilluan veprimtari patriotike një varg atdhetarësh";
                a=new Info( 11,  infokelcyra,  R.drawable.kelcyra, R.drawable.kelcyra_sm,  MapsActivity.Kelcyra,  kala[i], videoId);
            } else if ( i==12) {
                String infokruja="Kjo kala me trajtë eliptike dhe me perimetër 804 m, " +
                        "zë një sipërfaqe prej 2.5 ha tokë dhe është ngritur në një kodër shkëmbore." +
                        " Gërmimet arkeologjike të vitit 1978 dëshmojnë se kodra ka qenë e banuar që në shek" +
                        " e III p.e.r. ndërsa kalaja është ngritur në shek. V-VI e.r. Pranë saj është zbuluar" +
                        " një varrezë e madhe e kulturës arbërore. \n Përmendet me emrin e sotëm në shek e IX " +
                        "bashkë me qytetin e Krujës si qendër peshkopale. Në shek XIII-XIV ishte qendra e " +
                        "shtetit të Arbrit. Gjatë periudhës së Skënderbeut u bë krye-fortesa e qëndresës së " +
                        "shqiptarëve kundër pushtimit osman. Edhe në ditët e sotme është një ndër vendet më " +
                        "të njohura dhe më të vizituar nga turistët. ";
                videoId="ZVdWLo8qtgc";
                a=new Info( 12,  infokruja,  R.drawable.kruja,R.drawable.kruja_sm,   MapsActivity.Kruja,  kala[i], videoId);
            }else if ( i==13) {
                String infohimara="Lagja kala e Himarës, ose fshati i Himarës, është ndërtuar mbi kodrën e Barbakasë." +
                        " Himara përbën një qytet me histori të gjatë, e cila fillon që në periudhën antike," +
                        " shek. XIII p. Kr.. Ajo është vendosur mbi një kodër ku sot ndodhet lagjja kala. " +
                        "Kreshta shkëmbore është fortifikuar për herë të parë në shek. XIII p. Kr. \n Më pas ndërtohet " +
                        "një tjetër fortifikim në shek. V p. Kr., me mure të ndërtuar me blloqe gurësh poligonalë " +
                        "ndërsa në shek. IV fortifikohet me mure të tipit trapezoidalë. Në shek. IV – III p. Kr. " +
                        "Himara renditet midis qendrave të lulëzuara të bregdetit Akrokeraun, krahas Meandrias(Borshit)." +
                        "Në brendësinë e rrethimit, në anën perëndimore të rrëpirës shkëmbore, përfshiheshin dhe banesa " +
                        "të ndërtuara dhe të punuara pjesërisht në shkëmb. \n Rëndësia e kësaj qendre në periudhën antike" +
                        " vlerësohet nëpërmjet gjetjeve të shumta arkeologjike, si objekte qeramike, maja heshtash, " +
                        "shpata hekuri, etj. apo edhe një mbishkrim të vitit 169 p. Kr. të zbuluar në Delf, sipas të cilit " +
                        "qyteti Kemarai (Himarë) dërgon tek orakulli i Delfit theorodokët (priftërinjtë), krahas qyteteve " +
                        "të tjera të Foinikes dhe Abanties. ";
                videoId = "";
                a=new Info( 13,  infohimara,  R.drawable.himara,R.drawable.himara_sm,   MapsActivity.Himara,  kala[i], videoId);
            }else if ( i==14) {
                String infolekuresi="Kalaja ndodhet midis rrënojave të fshati Lëkurës mbi majën e një kodre të lartë" +
                        " që ngrihet sipër qytetit të Sarandës. Ka një pozicion të veçantë strategjik nga ku mund " +
                        "të shikoni gjithë qytetin e Sarandës dhe rrugën që shkon në Butrintit, gjithashtu mund " +
                        "të shijoni dhe një panoramë të ishujve të Ksamilit. \n Ka formë katrore me dy kulla të" +
                        " rrumbullakëta të vendosura në VP dhe JL. Katrori me dy rrumbullake ne diagonale është " +
                        "simboli i lëkurëpunuesve në mesjete ne këto zona. Kati i parë ka shërbyer si depo. " +
                        "Kuptohet nga pozicioni i vendosjes që qëllimi kryesor i ndërtimit të kalasë ishte " +
                        "vrojtimi i detit. Lartësia e mureve arrin 6,7-7 m trashësia e tyre deri në 2 m. " +
                        " \n Sot në Lëkurës funksionon një bar-restorant me arkitekturë të hershme dhe tepër " +
                        "bashkëkohore, ofron një shërbim ideal. Është kthyer në një nga pikat më të bukura " +
                        "turistike dhe nga më të frekuentuarat për çdo turist që viziton Sarandën.Mendohet " +
                        "nga historianët të jetë ndërtuar rreth viteve 1537, në kohën kur Sulltan Sulejmani " +
                        "sulmoi Korfuzin dhe i lindi si domosdoshmëri kontrolli i Skelës së Sarandës dhe rrugës" +
                        " që kalon Sarandë-Butrint. ";
                a=new Info( 14,  infolekuresi,  R.drawable.lekuresi,R.drawable.lekuresi_sm,   MapsActivity.Lekuresi,  kala[i], videoId);
            }else if ( i==15) {
                String infolezha="Kalaja e Lezhës ngrihet në majë të një kodre me lartësi 186 metra, në lindje të qytetit." +
                        " Kalaja ka origjinë ilire. Në vitin 1440 ajo iu nënshtrua një rindërtimi nga venedikasit, " +
                        "ndërsa në vitin 1522 pas pushtimit osman u rindërtua edhe nga ana e tyre. Këtu mund të shikohen" +
                        " gjurmë të arkitekturave ilire, romake, bizantine dhe osmane. \n Objektet më interesante për tu " +
                        "vizituar janë rrënojat e ndërtesave osmane brenda kalasë, xhamia, kulla në murin juglindor" +
                        " me një hark romak dhe kulla ilire në murin jugor. Kalaja e Lezhës është monument kulture." +
                        " Prej saj shihet një pamje mjaft e bukur e fushës së Lezhës dhe e detit Adriatik." +
                        "Qyteti i ndërtuar në kodër ka një pozicion strategjik që kontrollon luginën e Drinit deri" +
                        " në Gjirin e Shën Gjinit në detin Adriatik";
                videoId="O7abP6M0Nt4";
                a=new Info( 15,  infolezha,  R.drawable.lezha,R.drawable.lezha_sm,   MapsActivity.Lezha,  kala[i], videoId);
            }else if ( i==16) {
                String info="Kalaja e Pogradecit është e vendosur në majën e kodrës, " +
                        "në pjesën perëndimore të qytetit të Pogradecit, me lartësi 205 m mbi nivelin e liqenit " +
                        "të Ohrit. Ka filluar të banohej që në shek. V para Krishtit, ndërsa në shek. IV para" +
                        " Krishtit u pajis me mure mbrojtëse. Ka pasur një vjetërsi banimi prej 1400 vjetësh, " +
                        "duke qenë një kala iliro - shqiptare e hershme. ";
                videoId = "";
                a=new Info( 16,  info,  R.drawable.pogradeci,R.drawable.pogradeci_sm,   MapsActivity.Pogradeci,  kala[i], videoId);
            }else if ( i==17) {
                String infopeqini="Themelet e kalasë së Peqinit mendohet se i përkasin periudhës romake," +
                        " në kohën e ndërtimit të rrugës \"Egnatia\" dhe më pas është rikonstruktuar" +
                        " edhe gjatë pushtimit turk. Muret e kalasë, që mban edhe emrin e vendbanimit " +
                        "ilir të Klaudianës kanë pasur një lartësi prej rreth 12 metrash. Kalaja e " +
                        "\"Klaudianës\" është zgjeruar në shekullin e XIV-të nga turqit, " +
                        "të cilët ia dhanë më pas spahiut të kazasë, i cili ndërtoi një saraj dykatësh" +
                        " dhe një harem. Demir Pasha ka qenë i fundit që ka jetuar në kalanë e Peqinit." +
                        " \n Këtë fortesë e përmend në shënimet e tij edhe kronikani i shekullit të XVII-të," +
                        " Çelebiu, i cili thotë : \"...muret e kësaj kështjelle shkojnë rreth 12 metra të " +
                        "lartë. Brenda rri dizdari dhe ka 70 ushtarë. Ka 5 topa në këtë kështjellë dhe 10 " +
                        "shtëpi të vogla të mbuluara me tjegulla. Ka gjithashtu një xhami të vogël pa minare" +
                        ". Në të majtë të kështjellës ngjitur me një mur ka një namazgja...\". \n Kalaja" +
                        " ka qenë e pajisur me llagëme (tunele) të nëndheshme që shërbenin si" +
                        " dalje disa kilometra larg qytetit, në kohë të vështira. Po ashtu, " +
                        "në muret e kalasë janë gjetur tuba prej balte, që sipas arkeologëve do të thotë " +
                        "se në kohë lufte furnizimi me ujë është bërë nga jashtë. ";
                videoId="TLNShDIyoLE";
                a=new Info( 17,  infopeqini,  R.drawable.peqini,R.drawable.peqini_sm,   MapsActivity.Peqini,  kala[i], videoId);
            }else if ( i==18) {
                String infopetralba="Kalaja e Gurit të Bardhë apo Petralbës, siç njihet ndryshe dikur ishte " +
                        "një ndër selitë e Kastriotëve. Sipas historianëve zona përbënte një ndër pikat" +
                        " e rëndësishme nën varësinë e tyre me një popullsi jo të vogël për kohën." +
                        "\n" +
                        "Ngjitja drejt selisë së dikurshme që siç shkruan Marin Barleti frekuentohej në mënyrë " +
                        "të rregullt nga Donika Kastrioti, por edhe nga bashkëshorti i saj Gjergj Kastrioti Skënderbeu" +
                        " është një kacavirrje e vazhdueshme mes majave të thepisura. Duket e jashtëzakonshme të " +
                        "shohësh vendin e saj, ndoshta për këtë Barleti e cilësonte një kala të ngritur majë një mali" +
                        " e që s’i trembej asnjë fuqie armike, përveç urisë.  ";
                videoId = "";
                a=new Info( 18,  infopetralba,  R.drawable.petralba,R.drawable.petralba_sm,   MapsActivity.Petralba,  kala[i], videoId);
            }else if ( i==19) {
                String infopetrela="KKalaja e Petrelës nga zbulimet e bëra, është kala mesjetare e ndërtuar në kohën " +
                        "e sundimit të Perandorit Bizantin Justianit të I, në shekullin e VI pas Krishtit." +
                        " Kjo qe një prej kalave të ngritura prej tij në sistemin mbrojtës së Perandorisë.Është " +
                        "kala e ngritur mbi një terren me shpate mjaft të pjerrëta, madje nga ana jugore dhe" +
                        " juglindore të thepisura, të cilat e kanë bërë kalanë shumë të mbrojtur. " +
                        " \n Ajo u ngrit në momentin kur Kalaja e Vilës, kala antike, e cila ndodhet përballë" +
                        " Kalasë së Petrelës, e humbi rëndësinë e saj. Ajo u ngrit kryesisht për qëllime ushtarake." +
                        " Kalaja e Petrelës kontrollonte rrugën Egnatia, dega Durrës-Tiranë-Elbasan, " +
                        "e cila për kohën kishte rëndësi të veçantë. \n Në fillim të shek. XIV-të ishte nën " +
                        "sundimin e Topiajve, në atë kohë zotërues midis Matit e Shkumbinit, në një " +
                        "faqe të murit ruhet dhe emblema e parë e Topiajve. ";
                a=new Info( 19,  infopetrela,  R.drawable.petrela,R.drawable.petrela_sm,   MapsActivity.Petrela,  kala[i], videoId);
            }else if ( i==20) {
                String infoportopalermo="Kalaja e vogël është e vendosur në një pozicion mjaft të bukur" +
                        " në një gadishull në gjirin e vogël tektonik të Porto Palermos (në antikitet" +
                        " e njohur si gjiri i Panormes). Kalaja ndodhet jo larg fshatit të Qeparose" +
                        " dhe ka formë trekëndore. Përmasat e saj janë 150 m x 400 m. Lartësia e mureve " +
                        "arrin në 20 m.\n" +
                        "\n" +
                        "Kalaja e Porto Palermos ndodhet në gjirin me të njëjtin emër në bregun e detit " +
                        "Jon në Shqipërinë e jugut. Kalaja ndodhet mbi një ishull rreth 30 m larg bregut" +
                        " ku rripi i ngushtë ujor midis bregut dhe ishullit është mbushur me dhe e gurë" +
                        " për të realizuar një lidhje tokësore me të.\n" +
                        "\n" +
                        "Kalaja ka formë planimetrike trekëndore me tre bastione të fuqishme nëpër" +
                        " qoshet. Hyrja ndodhet në mesin e murit jugor. Nga ana e detit, midis dy" +
                        " bastioneve një sipërfaqe në formë trapezi është rrethuar me mure të pajisura" +
                        " me frëngji. Pjesa tjetër e kështjellës përbëhet nga një numër i madh ambientesh " +
                        "të mbuluara me qemerë të cilat përfundojnë në pjesën e sipërme me një tarracë " +
                        "të përbashkët. Ambientet shërbenin për strehimin e garnizonit, ndërsa njeri " +
                        "prej tyre shërbente si burg.\n" +
                        "\n" +
                        "Kalaja është shume me e vjetër se Ali Pashaj, ai e ka restauruar, e ka pasur " +
                        "ne kontroll këtë pike dhe vetëm si vizitor ka qene aty, nuk ka jetuar kurrë aty." +
                        " Kishën (Shën Nikolla) nuk e ka bere ai ka qene atje, dhe gjelbërimi " +
                        "nuk është gjithëvjeçar ne dimër thahet.";
                videoId="qnP7hZLBZvI";
                a=new Info( 20,  infoportopalermo,  R.drawable.portopalermo,R.drawable.portopalermo_sm,   MapsActivity.PortoPalermo,  kala[i], videoId);
            }else if ( i==21) {
                String infopreza="Kalaja e Prezës është ndërtuar mbi një shkëmb i cili zgjatet duke u ulur në drejtim " +
                        "të veri-jugut. Ana lindore e kalasë është e mbrojtur nga vetë terreni, kurse ana perëndimore" +
                        " përbën një territor të sheshtë, prandaj dhe fortifikimi është përqendruar pikërisht në " +
                        "këtë pjesë.\n" +
                        "Kalaja ka planimetri katërkëndore me brinjë 80 x 50 m. Ajo përforcohet nëpër qoshe " +
                        "me katër kulla që kanë planimetri rrethore. Në murin perëndimor për të përforcuar " +
                        "më tepër sistemin fortifikues të kalasë, pasi kjo pjesë është me e ekspozuar dhe më pak " +
                        "e mbrojtur ndaj sulmeve si dhe ka një largësi të konsiderueshme midis kullave, " +
                        "është ndërtuar një kullë katërkëndëshe e dalë nga muri. \n Në faqen jugore është ndërtuar" +
                        " një kullë tjetër katërkëndëshe për të mbrojtur hyrjen e vetme të kalasë. Kjo kullë " +
                        "përforcohet dhe nga oborri që ndodhet në përbërje të saj. Në kala kemi katër faza " +
                        "të ndryshme ndërtimi. Periudha e parë lidhet me fortifikim e kalasë, e dyta lidhet" +
                        " me rindërtimin e mureve rrethuese, e treta ka të bëjë me ndërtimet që janë bërë " +
                        "brenda mureve rrethuese, kurse faza e katër lidhet me ndërtimin e një kulle sahati" +
                        " që nuk ka të bëjë me sistemin fortifikues, por i përket një periudhe të mëvonshme ";
                videoId = "";
                a=new Info( 21,  infopreza,  R.drawable.preza,R.drawable.preza_sm,   MapsActivity.Preza,  kala[i], videoId);
            }else if ( i==22) {
                String inforodoni="Kalaja e Rodonit ndodhet në kepin e Rodonit. Princi Karl Topia dëshironte " +
                        "ta kthente këtë vend në një kantier detar, ndërsa Skënderbeu, duke synuar që të " +
                        "kishte një dalje të afërt në det, ngriti këtu një kështjellë. Kjo kala filloi të " +
                        "ngrihej mbas rrethimit të parë të Krujës në vitin 1450. Përfundimi i saj mendohet " +
                        "të jetë rreth vitit 1452. Muri i kështjellës së Rodonit arrinte në një gjatësi prej " +
                        "400 metrash dhe në kulmet e saj kishte kulla të rumbullakëta. \n Në vitin 1500 kalaja " +
                        "u pushtua nga Venediku. Si rezultat i veprimtarive erozive të ujërave të detit, " +
                        "një pjesë e mureve janë zhytur nën ujërat e detit Adriatik. Sot vizitorët mund të " +
                        "shikojnë muret e jashtme të anës së djathtë, të cilat përfundojnë me një kullë të " +
                        "rrumbullakët. Pranë kalasë ndodhen edhe rrënojat e Kishës së Shën Pjetrit, të cilat " +
                        "konsiderohen nga banorët si vend i shenjtë. ";
                a=new Info( 22,  inforodoni,  R.drawable.rodoni,R.drawable.rodoni_sm,   MapsActivity.Rodoni,  kala[i], videoId);
            }else if ( i==23) {
                String inforozafa="Kështjella e Rozafatit është e ngritur mbi një kodër shkëmbore në hyrje" +
                        " të qytetit të Shkodrës. Mbi faqet e pjerrëta të kodrës ngrihen muret rrethuese " +
                        "të cilat zenë një sipërfaqe rreth 9 ha. Në periudhën e lashtë muret ishin të stilit " +
                        "poligonal, gjurmë të të cilave ruhen edhe sot. Si qendër e fortifikuar ilire përmendet" +
                        " për herë të parë gjatë sundimit të mbretit Gent dhe historiani Tit Livi e quan \"vendi " +
                        "më i fortë i labeatëve\". \n Kështjella del me emrin Rozafa në periudhën e mesjetës," +
                        " gjatë së cilës u pushtua herë nga sllavët dhe herë nga bizantinët. " +
                        "Brenda mureve të saj ruhen një sërë mjedisesh si garnizone, depo, " +
                        "një ndërtesë administrative etj ";
                videoId="DtY7wtYlZ5Q";
                a=new Info( 23,  inforozafa,  R.drawable.shkodra,R.drawable.shkodra_sm,   MapsActivity.Rozafa,  kala[i], videoId);
            }else if ( i==24) {
                String infosebaste="Kalaja e Laçit i përket si ndërtim antikitetit të vonë që mbijetoi" +
                        " edhe në mesjetë.\n" +
                        "\n" +
                        "Muret e rrethimit fortifikues të kështjellës së Sebastes e cila shërbente " +
                        "si pikë kontrolli në rrugën Dyrrhachium-Lisus-Scodrae, bazuar në teknikën " +
                        "e ndërtimit me gurë kuadratikë si dhe fragmentet e qeramikës me vernik të zi " +
                        "të gjetura brenda saj, e datojnë atë si kala të fundit të shekullit të 4-ërt " +
                        "dhe fillimit të shekullit të 3-të. \n Sipas një mbishkrimi sepulkral nga burimet" +
                        " antike të shek. I, ku përmendet LUPUS PARTHINUS EX LATIO, mendohet se kjo " +
                        "kështjellë i përket qyetit LATIUM, i cili identifikohet si vendndodhje me Laçin" +
                        " e sotëm." ;
                videoId = "";
                          a=new Info( 24,  infosebaste,  R.drawable.sebaste,R.drawable.sebaste_sm,   MapsActivity.Sebaste,  kala[i], videoId);
            }else if ( i==25) {
                String infotepelena="Kalaja e Ali Pashë Tepelenës ndodhet në veri të qytetit në një pozicion " +
                        "gjeografik që ndihmonte në mbrojtejen e kalasë. Nga burimet historike, kalaja është " +
                        "vizonuar nga vetë Pashai i cili ka inspektuar etapat e ndërtimit të kësaj perle të " +
                        "rajonit. Kalaja aktuale u rindërtua prej tij më 1819 me një sipėrfaqe 4-5 ha me" +
                        " tre hyrje dhe 3 kulla. Deri mė 1820 ka qėnė rezidenca e dytė e Ali Pashë Tepelenës." ;

                       videoId="pbER0N0HkMk";
                a=new Info( 25,  infotepelena,  R.drawable.tepelena,R.drawable.tepelena_sm,   MapsActivity.Tepelena,  kala[i], videoId);
            }else if ( i==26) {
                String infotirana="Kalaja e Tiranës ishte një stacion rrugor i vijës Egnatia i tipit Mansio-Mutatio." +
                        " Ajo përbënte qendrën e një vendbanimi, të emërtuar me një variacion emrash që në s" +
                        "hekujt e parë të erës sonë. Tirkan (shek IV e.s ), Tergiana (1297) kur në të ishte " +
                        "vendosur kancelaria e sundimtarit të saj Karli I Anzhu, dhe në formën e sotme Tyranna (1505)" +
                        " sipas Barletit. \n Ky tiponim akoma nuk është saktësuar plotësisht. Por kalaja, dëshmia më e " +
                        "lashtë e këtij qyteti, ndodhet pikërisht në vendin ku derdheshin e kryqëzoheshin rrugët e " +
                        "vjetra e të reja që e lidhnin kryeqytetin dhe pastaj krejt Shqipërinë – veriun me jugun, " +
                        "lindjen me perëndimin. \n Në ambientet e Kalasë së Tiranës ka disa shtëpi tradicionale të " +
                        "cilat kanë krijuar stilin e ndërtesës qytetare Tiranase. Në ndërtesat brenda Kalasë së " +
                        "Tiranës kanë banuar pjesëtarë të familjeve sunduese të qytetit dhe për këtë arsye ato " +
                        "konsiderohen edhe si godina të administratës së parë lokale." ;
                videoId = "";
                a=new Info( 26,  infotirana,  R.drawable.tirana,R.drawable.tirana_sm,   MapsActivity.Tirana,  kala[i], videoId);
            } else if ( i==27) {
                String infovaroshi="Kalaja e Varoshit është monument kulturor i ndodhur në Ndroq , Tiranë.Ky monument" +
                        " kulturor i takon kategorisë arkitekturor dhe është i mbrojtur me ligj.Në dokumentet turke " +
                        "kjo kala njihej edhe me emrin Stelush. Kalaja e cila i përket shek.XIV është ndërtuar në " +
                        "një pikë strategjike mbi një majë shkëmbore të mbrojtur. Rrafshi i vogël në jug e lidhte me" +
                        " qytetin e poshtëm, Varoshin. \n Zotëronte njërën nga dy rrugët kryesore që lidhnin Dibrën me " +
                        "Matin dhe me bregdetin e Shqipërisë. Varoshi u rindërtua dhe mori tiparet e një qyteti" +
                        " mesjetar kur u fuqizua principata e Kastriotëve. Skënderbeu e mori në dhjetor 1443, " +
                        "e përfshiu në sistemin mbrojtës të vendit dhe kështjella luajti rol në luftërat e tij." ;
                videoId = "";
                a=new Info( 27,  infovaroshi,  R.drawable.varoshi, R.drawable.varoshi_sm,  MapsActivity.Varoshi,  kala[i], videoId);
            }else if (i==28) {
                String infozgerdheshi="Kalaja e Zgërdheshit ne fshatin Zgerdhesh ne Lindje te Ures se Zeze, " +
                        "ne JugPerendim te fshatit Zgerdhesh, ne kuoten 252, muret dhe gjithe kodra e kufizuar " +
                        "nga veriu e jugu me 2 perrenjte, nga lindja me qafen dhe nga perendimi ne arat e lagjes" +
                        " Kakariq." ;
                a=new Info( 28,  infozgerdheshi, R.drawable.zgerdheshi,R.drawable.zgerdheshi_sm,   MapsActivity.Zgerdheshi,  kala[i], videoId);
            }
            castles.add(a);

        }

        //videos liste me objekte video





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        ListAdapter adapter = new CustomAdapter(this, castles);

        ListView kalalistView = (ListView) findViewById(R.id.listid);
        kalalistView.setAdapter(adapter);
        kalalistView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                    @Override
                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent article = new Intent(MainActivity.this, Articles.class);
                        //Info data= castles.get(position);
                        article.putExtra("selCastle",  castles.get(position));
                        startActivity(article);


            }



                }

        );

    }

}


