package com.bluetoothfunction;

import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseTable {

    private static final String TAG = "DictionaryDatabase";

    //The columns we'll include in the dictionary table
    public static final String COL_WORD = "WORD";
    public static final String COL_DEFINITION = "DEFINITION";

    private static final String DATABASE_NAME = "DICTIONARY";
    private static final String FTS_VIRTUAL_TABLE = "FTS";
    private static final int DATABASE_VERSION = 1;

    private final DatabaseOpenHelper databaseOpenHelper;

    public DatabaseTable (Context context) {
        databaseOpenHelper = new DatabaseOpenHelper(context);
}

private static class DatabaseOpenHelper extends SQLiteOpenHelper {
    private final Context helperContext;
    private SQLiteDatabase;

    private static final String FTS_TABLE_CREATE =
            "CREATE VIRTUAL TABLE " + FTS_VIRTUAL_TABLE +
                    " USING fts3 (" +
                    COL_WORD + ", " +
                    COL_DEFINITION + ")";

    DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        helperContext = context;
    }


    }
}
