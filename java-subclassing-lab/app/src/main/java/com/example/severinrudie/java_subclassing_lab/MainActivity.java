package com.example.severinrudie.java_subclassing_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        /*
    Create an Android app with the following requirements:
Must have at least 6 animals selectable by buttons
When a button is clicked, a view must appear that shows a picture of that animal
The name of the animal must appear on top of the animal's picture
The id of the animal must appear on top of the animal's picture (The id is a random string of characters you get to make up!)
When the animal's picture is clicked, show a toast with the noise that animal makes (A cow goes moo)

     */

    public final static String ANIMAL = "com.example.severinrudie.java_subclassing_lab.ANIMAL";

    public final static String passableEmu = "emu";
    public final static String passableEagle = "eagle";
    public final static String passableKomodo = "komodo_dragon";
    public final static String passableAnaconda = "anaconda";
    public final static String passableHuman = "human";
    public final static String passableKangaroo = "kangaroo";
    public final static String passableFox = "fox";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToEmu(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableEmu);
        startActivity(intent);
    }

    public void goToEagle(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableEagle);
        startActivity(intent);
    }

    public void goToKomodo(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableKomodo);
        startActivity(intent);
    }

    public void goToAnaconda(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableAnaconda);
        startActivity(intent);
    }

    public void goToHuman(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableHuman);
        startActivity(intent);
    }

    public void goToKangaroo(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableKangaroo);
        startActivity(intent);
    }

    public void goToFox(View view) {
        Intent intent = new Intent(this, AnimalActivity.class);
        intent.putExtra(ANIMAL, passableFox);
        startActivity(intent);
    }


}
