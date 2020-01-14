package com.example.fantasygameui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class MainActivity extends AppCompatActivity {


    String[] descriptionData = {"Select Match", "Create Team", "Join Contest"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.progress_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);
    }
}
