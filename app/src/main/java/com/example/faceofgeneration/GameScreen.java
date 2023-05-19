package com.example.faceofgeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import android.media.MediaPlayer;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.content.ContentValues;

import pl.droidsonroids.gif.GifImageView;

public class GameScreen extends AppCompatActivity {
    public DatabaseHelper databaseHelper;
    public MediaPlayer mediaPlayer;
    public ImageView image;
    public TextView text;
    public Button button1, button2, button3, button4;
    public Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        databaseHelper = new DatabaseHelper(this);
        story = new Story(this);

        image = findViewById(R.id.gameImageView);
        text = findViewById(R.id.gameTextView);
        button1 = findViewById(R.id.choiceButton1);
        button2 = findViewById(R.id.choiceButton2);
        button3 = findViewById(R.id.choiceButton3);
        button4 = findViewById(R.id.choiceButton4);
        story.startingPoint();
    }

    public void button1(View view) {
        story.selectPosition(story.nextPosition1);
    }

    public void button2(View view) {
        story.selectPosition(story.nextPosition2);
    }

    public void button3(View view) {
        story.selectPosition(story.nextPosition3);
    }

    public void button4(View view) {
        story.selectPosition(story.nextPosition4);
    }

    public void goTitleScreen() {
        Intent titleScreen = new Intent(this, TitleScreen.class);
        mediaPlayer.stop();
        mediaPlayer.release();
        startActivity(titleScreen);
    }

    public void saveData(String endings, String rapper, String beatmaker, String musician, String nikto) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_ENDINGS, endings);
        values.put(DatabaseHelper.COLUMN_RAPPER, rapper);
        values.put(DatabaseHelper.COLUMN_BEATMAKER, beatmaker);
        values.put(DatabaseHelper.COLUMN_MUSICIAN, musician);
        values.put(DatabaseHelper.COLUMN_NIKTO, nikto);
        long newRowId = db.insert(DatabaseHelper.TABLE_NAME, null, values);
        db.close();
    }

    public String[] loadData() {
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
                sortOrder,
                "10" // Ограничение результата до 10 строк (можно изменить на нужное количество)
        );

        String[] loadedData = new String[5 * cursor.getCount()];
        int index = 0;

        if (cursor != null && cursor.moveToFirst()) {
            do {
                loadedData[index++] = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_ENDINGS));
                loadedData[index++] = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_RAPPER));
                loadedData[index++] = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_BEATMAKER));
                loadedData[index++] = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_MUSICIAN));
                loadedData[index++] = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_NIKTO));
            } while (cursor.moveToNext());

            cursor.close();
        }

        db.close();

        return loadedData;
    }

    public void clearDatabase() {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        db.delete(DatabaseHelper.TABLE_NAME, null, null);
        db.close();
    }

    public boolean isDataExists() {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        String query = "SELECT COUNT(*) FROM " + DatabaseHelper.TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        int count = 0;

        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }

        cursor.close();
        db.close();

        return count > 0;
    }
}