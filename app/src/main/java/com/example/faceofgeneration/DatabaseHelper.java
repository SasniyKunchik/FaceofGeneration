package com.example.faceofgeneration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "saves.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "mytable";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_ENDINGS = "endings";
    public static final String COLUMN_RAPPER = "rapper";
    public static final String COLUMN_BEATMAKER = "beatmaker";
    public static final String COLUMN_MUSICIAN = "musician";
    public static final String COLUMN_NIKTO = "nikto";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_ENDINGS + " TEXT, " +
                COLUMN_RAPPER + " TEXT, " +
                COLUMN_BEATMAKER + " TEXT, " +
                COLUMN_MUSICIAN + " TEXT, " +
                COLUMN_NIKTO + " TEXT);";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropTableQuery);
        onCreate(db);
    }
}
