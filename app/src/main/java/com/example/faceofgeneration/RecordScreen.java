package com.example.faceofgeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.media.MediaPlayer;

public class RecordScreen extends AppCompatActivity {

    private TableLayout tableLayout;
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_screen);


        tableLayout = findViewById(R.id.tableLayout);
        displayRecords();
    }

    private void displayRecords() {
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        String[] projection = {
                DatabaseHelper.COLUMN_ENDINGS,
                DatabaseHelper.COLUMN_RAPPER,
                DatabaseHelper.COLUMN_BEATMAKER,
                DatabaseHelper.COLUMN_MUSICIAN,
                DatabaseHelper.COLUMN_NIKTO
        };
        String sortOrder = DatabaseHelper.COLUMN_ID + " DESC"; // Сортировка по ID в порядке убывания
        Cursor cursor = db.query(
                DatabaseHelper.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                sortOrder
        );

        while (cursor.moveToNext()) {
            String endings = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_ENDINGS));
            String rapper = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_RAPPER));
            String beatmaker = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_BEATMAKER));
            String musician = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_MUSICIAN));
            String nikto = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_NIKTO));

            addRecordToTable(endings, rapper, beatmaker, musician, nikto);
        }

        cursor.close();
        db.close();
    }

    private void addRecordToTable(String endings, String rapper, String beatmaker, String musician, String nikto) {
        TableRow tableRow = new TableRow(this);

        TextView endingsTextView = new TextView(this);
        endingsTextView.setText(endings);
        endingsTextView.setTextColor(Color.BLUE);
        tableRow.addView(endingsTextView);

        TextView rapperTextView = new TextView(this);
        rapperTextView.setText(rapper);
        rapperTextView.setTextColor(Color.BLUE);
        tableRow.addView(rapperTextView);

        TextView beatmakerTextView = new TextView(this);
        beatmakerTextView.setText(beatmaker);
        beatmakerTextView.setTextColor(Color.BLUE);
        tableRow.addView(beatmakerTextView);

        TextView musicianTextView = new TextView(this);
        musicianTextView.setText(musician);
        musicianTextView.setTextColor(Color.BLUE);
        tableRow.addView(musicianTextView);

        TextView niktoTextView = new TextView(this);
        niktoTextView.setText(nikto);
        niktoTextView.setTextColor(Color.BLUE);
        tableRow.addView(niktoTextView);

        tableLayout.addView(tableRow);
    }
    public void goTitleScreen(View view){
            Intent titleScreen = new Intent(this, TitleScreen.class);
            mediaPlayer.stop();
            mediaPlayer.release();
            startActivity(titleScreen);
        }
    }