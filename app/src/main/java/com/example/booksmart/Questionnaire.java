package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class Questionnaire extends AppCompatActivity {
CheckBox notReader, Reader, hp,pp,wwl,TheHuntingOfHillHouse,Friends,Sherlock,DaVinci,Supernatural,brendon,rick,Ian,Vladimir;
RadioButton Female, Male, Other;
SeekBar Length;
EditText favoriteGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);
        Intent i=getIntent();
       /* notReader=findViewById(R.id.cbNotreader); Ian=findViewById(R.id.cbIanFlaming);
        Reader=findViewById(R.id.cbReader); Vladimir=findViewById(R.id.cbVladimir);
        hp=findViewById(R.id.cbHp); Female=findViewById(R.id.rbFemale);
        pp=findViewById(R.id.cbPP); Male=findViewById(R.id.rbMale);*/
       /* wwl=findViewById(R.id.cbWWL); Other=findViewById(R.id.rbOther);
        TheHuntingOfHillHouse=findViewById(R.id.cbTheHuntingOfHillHouse); Length=findViewById(R.id.sbLength);
        Friends=findViewById(R.id.cbFriends); favoriteGenre=findViewById(R.id.etFavorGenre);*/
        Sherlock=findViewById(R.id.cbSherlock);
        DaVinci=findViewById(R.id.cbDaVinci);
        Supernatural=findViewById(R.id.cbSupernatural);
        brendon=findViewById(R.id.cbBrendonSAnderson);
        rick=findViewById(R.id.cbRickRiorden);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onCheckboxClicked(notReader); onCheckboxClicked(notReader);
        onRadioButtonClicked(Female); onRadioButtonClicked(Male);
        onRadioButtonClicked(Other);

    }
    public void onCheckboxClicked(View view) {
        // Is the view  checked?
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {// Enter to the database
        }
        }
        public void onRadioButtonClicked(View view){
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            if (checked) {  // Pirates are the best
                 }
        }

    }

