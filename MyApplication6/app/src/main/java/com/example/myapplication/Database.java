package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Database extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "test";
    private static final String TABLE_CONTACTS = "test";
    private static final String KEY_ID = "Name";
    private static final String KEY_salary = "salary";
    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String create_table = "CREATE TABLE test ( Name VARCHAR(50),salary INTEGER)";
        db.execSQL(create_table);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    }
    public void insert(String name,Integer n)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put(KEY_ID,name);
        value.put(KEY_salary,n);
        db.insert(TABLE_CONTACTS,null,value);
        db.close();
    }
    Integer getSalary(String name)
    {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID,
                        KEY_salary}, KEY_ID + "=?",
                new String[] { name }, null, null, null, null);
        if(cursor != null) {
            cursor.moveToFirst();
        }
        int s = Integer.parseInt(cursor.getString(1));
        return s;
    }
    public int update(String name,Integer s)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_salary,s);
        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[] { name });
    }
    public void delete(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[] { name });
        db.close();
    }
}

