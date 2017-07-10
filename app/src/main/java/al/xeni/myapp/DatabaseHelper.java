package al.xeni.myapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.AccessControlContext;

/**
 * Created by Edi on 02/07/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AlbanianCastles.db";

    private Context context;
    private SQLiteDatabase db;
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DbContract.DbEntry.TABLE_NAME + " (" +
                    DbContract.DbEntry.COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DbContract.DbEntry.COL_2 + " TEXT," +
                    DbContract.DbEntry.COL_3 + " TEXT," +
                    DbContract.DbEntry.COL_4 + " TEXT," +
                    DbContract.DbEntry.COL_5 + " REAL," +
                    DbContract.DbEntry.COL_6 + " REAL," +
                    DbContract.DbEntry.COL_7 + " TEXT," +
                    DbContract.DbEntry.COL_8 + " TEXT," +
                    DbContract.DbEntry.COL_9 + " TEXT," +
                    DbContract.DbEntry.COL_10 + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DbContract.DbEntry.TABLE_NAME;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

   /* public static final String COL_2 = "INFO";
    public static final String COL_3 = "IMG";
    public static final String COL_4 = "IMG_SM";
    public static final String COL_5 = "LAT";
    public static final String COL_6 = "LNG";
    public static final String COL_7 = "TITLE";
    public static final String COL_8 = "VIDEO";
    public static final String COL_9 = "INFO_EN";
    public static final String COL_10 = "TITLE_EN";*/


    public boolean insertData(String info, String img, String img_sm, double lat, double lng,
                              String title, String video, String info_en, String title_en){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbContract.DbEntry.COL_2, info);
        contentValues.put(DbContract.DbEntry.COL_3, img);
        contentValues.put(DbContract.DbEntry.COL_4, img_sm);
        contentValues.put(DbContract.DbEntry.COL_5, lat);
        contentValues.put(DbContract.DbEntry.COL_6, lng);
        contentValues.put(DbContract.DbEntry.COL_7, title);
        contentValues.put(DbContract.DbEntry.COL_8, video);
        contentValues.put(DbContract.DbEntry.COL_9, info_en);
        contentValues.put(DbContract.DbEntry.COL_10, title_en);
        long result = db.insert(DbContract.DbEntry.TABLE_NAME, null, contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }

    public String writeToSD() throws IOException {
        File sd = Environment.getExternalStorageDirectory();

        if (sd.canWrite()) {
            String currentDBPath = DATABASE_NAME;
            String backupDBPath = "backupname.db";
            String DB_PATH = "";
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                DB_PATH = context.getFilesDir().getAbsolutePath().replace("files", "databases") + File.separator;
            }
            else {
                DB_PATH = context.getFilesDir().getPath() + context.getPackageName() + "/databases/";
            }

            File currentDB = new File(DB_PATH, currentDBPath);
            File backupDB = new File(sd, backupDBPath);


            if (currentDB.exists()) {
                FileChannel src = new FileInputStream(currentDB).getChannel();
                FileChannel dst = new FileOutputStream(backupDB).getChannel();
                dst.transferFrom(src, 0, src.size());
                src.close();
                dst.close();
            }
            return backupDB.getAbsolutePath();
        }
        return "not able to write";
    }
}
