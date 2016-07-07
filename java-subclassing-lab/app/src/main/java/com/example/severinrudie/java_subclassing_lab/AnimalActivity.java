package com.example.severinrudie.java_subclassing_lab;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class AnimalActivity extends AppCompatActivity {


          /*
    Create an Android app with the following requirements:
Must have at least 6 animals selectable by buttons
When a button is clicked, a view must appear that shows a picture of that animal
The name of the animal must appear on top of the animal's picture
The id of the animal must appear on top of the animal's picture (The id is a random string of characters you get to make up!)
When the animal's picture is clicked, show a toast with the noise that animal makes (A cow goes moo)

     */
    TextToSpeech textToSpeech;

    Emu emu;
    Eagle eagle;
    KomodoDragon komodo;
    Anaconda anaconda;
    Human human;
    Kangaroo kangaroo;
    Fox fox;

    String currentName = "";
    String currentId = "0";
    String currentPicture = "";
    String currentNoise = "";

    static MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal2);
        Intent intent = getIntent();
        String animal = intent.getStringExtra(MainActivity.ANIMAL);

        collectAnimalType(animal);
        populateFields();
        Button returnButton = (Button) findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnToMain();
            }
        });

        ImageView image = (ImageView) findViewById(R.id.animalPicture);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast();
            }
        });

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });

    }  // end onCreate

    private void returnToMain() {
        finish();
    }

    public void displayToast() {
        Toast.makeText(getApplicationContext(), currentNoise, Toast.LENGTH_LONG).show();

        startSpeech();
    }

    public void startSpeech() {
        if (currentName.equals("Fox")) {
            AnimalActivity.mPlayer.start();
        } else {
            textToSpeech.speak(currentNoise, TextToSpeech.QUEUE_FLUSH, null);
        }
    }




    // name, id, picture, noise
    private void collectAnimalType(String animalString) {

        if (animalString.equals(MainActivity.passableEmu)) {
            emu = new Emu("emu", "Emu", "Australia");

            currentId = emu.getId();
            currentName = emu.getSpecies();
            currentNoise = emu.getNoise();
            currentPicture = emu.getPicture();
        } else if (animalString.equals(MainActivity.passableEagle)) {
            eagle = new Eagle("eagle", "Bald Eagle", "America");

            currentId = eagle.getId();
            currentName = eagle.getSpecies();
            currentNoise = eagle.getNoise();
            currentPicture = eagle.getPicture();
        } else if (animalString.equals(MainActivity.passableKomodo)) {
            komodo = new KomodoDragon("komodo_dragon", "Komodo Dragon", "Southeast Asia");

            currentId = komodo.getId();
            currentName = komodo.getSpecies();
            currentNoise = komodo.getNoise();
            currentPicture = komodo.getPicture();
        } else if (animalString.equals(MainActivity.passableAnaconda)) {
            anaconda = new Anaconda("anaconda", "Anaconda", "South America");

            currentId = anaconda.getId();
            currentName = anaconda.getSpecies();
            currentNoise = anaconda.getNoise();
            currentPicture = anaconda.getPicture();
        } else if (animalString.equals(MainActivity.passableHuman)) {
            human = new Human("human", "Human", "Worldwide");

            currentId = human.getId();
            currentName = human.getSpecies();
            currentNoise = human.getNoise();
            currentPicture = human.getPicture();
        } else if (animalString.equals(MainActivity.passableKangaroo)) {
            kangaroo = new Kangaroo("kangaroo", "Kangaroo", "Australia");

            currentId = kangaroo.getId();
            currentName = kangaroo.getSpecies();
            currentNoise = kangaroo.getNoise();
            currentPicture = kangaroo.getPicture();
        } else if (animalString.equals(MainActivity.passableFox)) {
            fox = new Fox("fox", "Fox", "Trash Bins");

            currentId = fox.getId();
            currentName = fox.getSpecies();
            currentNoise = fox.getNoise();
            currentPicture = fox.getPicture();

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.foxsong);
        }

    }

    private void populateFields() {

        ImageView viewPicture = (ImageView) findViewById(R.id.animalPicture);
        TextView viewName = (TextView) findViewById(R.id.animalName);
        TextView viewId = (TextView) findViewById(R.id.animalId);

        try {
            viewName.setText(currentName);
            viewId.setText(currentId);
            int imageID = getImageId(this, currentPicture);
            viewPicture.setImageResource(imageID);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());

    }
}
