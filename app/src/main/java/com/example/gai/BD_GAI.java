package com.example.gai;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;


public class BD_GAI extends SQLiteOpenHelper {




    public BD_GAI(Context context) {
        super(context, "GAI.bd", null, 2);


    }

    public Elements_GAI Search_SH(String GOS, String STS,String VIN) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery(String.format("SELECT * FROM Shtraf_ugon WHERE GOS_nomer = '%s' AND STS = '%s' OR VIN = '%s';", GOS, STS,VIN), null);
       // Log.e("debug", cursor.getCount() + " ");
        Elements_GAI foundData = null;

        if (cursor != null) {


            if (cursor.moveToFirst()) {
                do {
                    int idColumnIndexGOS = cursor.getColumnIndex("GOS_nomer");
                    int idColumnIndexSTS = cursor.getColumnIndex("STS");
                    int idColumnIndexFIO = cursor.getColumnIndex("FIO");
                    int idColumnIndexMarka = cursor.getColumnIndex("Marka");
                    int idColumnIndexShtraf = cursor.getColumnIndex("Shtraf");
                    int idColumnIndexUgon = cursor.getColumnIndex("Ugon");
                    int idColumnIndexVin = cursor.getColumnIndex("VIN");


                    foundData = new Elements_GAI(cursor.getString(idColumnIndexGOS), cursor.getString(idColumnIndexSTS), cursor.getString(idColumnIndexFIO), cursor.getString(idColumnIndexMarka), cursor.getString(idColumnIndexShtraf), cursor.getString(idColumnIndexUgon), cursor.getString(idColumnIndexVin));
                } while (cursor.moveToNext());


                cursor.close();
            }
        }
        return foundData;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Shtraf_ugon (\n" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "GOS_nomer TEXT ,\n" +
                "STS TEXT,\n" +
                "FIO TEXT,\n" +
                "Marka TEXT,\n" +
                "Shtraf TEXT,\n" +
                "Ugon TEXT,\n" +
                "VIN TEXT\n" +
                ");");


       // sqLiteDatabase.execSQL("INSERT INTO Shtraf_ugon(GOS_nomer, STS,FIO,Marka,Shtraf,Ugon,VIN)
        // values('Е 777 КХ', '2 9 6','Конышев Тимур Рикимарович', 'GAZ', 'Yes', 'No','1 2 3 4 5 6 7 8 9 1')");
       // sqLiteDatabase.execSQL("INSERT INTO Shtraf_ugon(GOS_nomer, STS,FIO,Marka,Shtraf,Ugon,VIN)
        // values('А 000 АА', '2 9 6 3 9 7 2 5 8 6','Конышев Тимур Рикимарович', 'GAZ', 'Yes', 'No','1 2 3 4 5 6 7 8 9 1')");
    }
    public void InsertTable(String gs,String sts,String fio,String mar,String sh,String ugon,String vin)
    {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        sqLiteDatabase.execSQL(String.format("INSERT INTO Shtraf_ugon(GOS_nomer, STS,FIO,Marka,Shtraf,Ugon,VIN) values('%s','%s','%s','%s','%s','%s','%s');",gs, sts,fio,mar,sh,ugon,vin));


    }
    public void delete(String gos){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.delete("Shtraf_ugon","Gos_nomer = ?",new String[]{gos});
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (newVersion == oldVersion + 1) {
            oldVersion = newVersion;
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Shtraf_ugon");
            onCreate(sqLiteDatabase);
        }
    }
}