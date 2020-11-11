package com.example.wordsbook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;
import android.database.sqlite.SQLiteOpenHelper;


public class CreatDatabase extends SQLiteOpenHelper{

    public static final String CREAT_BOOK =
            "create table WordsBook ("
                    + "word varchar(50) primary key,"
                    + "meanings text,"
                    + "exampleSentence text)";

    private Context mContext;

    public CreatDatabase (Context context, String name, SQLiteDatabase.CursorFactory factory , int version){
        super(context,name,factory,version);

        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREAT_BOOK);
        Toast.makeText(mContext,"Create succeeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
