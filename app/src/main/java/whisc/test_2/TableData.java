package whisc.test_2;

/**
 * Created by Connor on 11/7/2017.
 */

import android.provider.BaseColumns;

public class TableData {

    public TableData()
    {

    }

    public static abstract class TableInfo implements BaseColumns
    {

        public static final String USER_NAME = "user_name" ;
        public static final String USER_PASS = "user_pass" ;
        public static final String DATABASE_NAME = "userdb97";
        public static final String TABLE_NAME = "regtb97";

    }

}
