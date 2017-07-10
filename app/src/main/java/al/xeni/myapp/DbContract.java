package al.xeni.myapp;

import android.provider.BaseColumns;

/**
 * Created by Edi on 02/07/2017.
 */

public class DbContract {
        private DbContract() {}

        /* Inner class that defines the table contents */
        public static class DbEntry implements BaseColumns {
            public static final String TABLE_NAME = "CASTLE";
            public static final String COL_1 = "ID";
            public static final String COL_2 = "INFO";
            public static final String COL_3 = "IMG";
            public static final String COL_4 = "IMG_SM";
            public static final String COL_5 = "LAT";
            public static final String COL_6 = "LNG";
            public static final String COL_7 = "TITLE";
            public static final String COL_8 = "VIDEO";
            public static final String COL_9 = "INFO_EN";
            public static final String COL_10 = "TITLE_EN";
        }
}
