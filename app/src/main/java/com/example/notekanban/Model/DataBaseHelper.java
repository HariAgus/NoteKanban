package com.example.notekanban.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "notekanban.db";
    private static final int DATABSE_VERSION = 1;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlNote = "create table note(id_note integer primary key autoincrement, title text, descri text);";
        db.execSQL(sqlNote);
        String sqlAccount = "create table account(id integer primary key autoincrement, username text, password text, no_phone String);";
        db.execSQL(sqlAccount);
        String  sqlCategory = "create table category(id integer primary key autoincrement, hexa integer);";
        db.execSQL(sqlCategory);
        String sqlList = "create table list(id integer primary key autoincrement, namelist text, id_note integer, foreign key (id_note) references note(id_note));";
        db.execSQL(sqlList);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
