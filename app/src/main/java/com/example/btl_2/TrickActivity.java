package com.example.btl_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrickActivity extends AppCompatActivity {

    TrickDAO trickDAO;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<Trick> tricks;
    Button trickTheory, trickPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trick);
        expandableListView = findViewById(R.id.list_trick);
        trickDAO = new TrickDAO(this);
//        tricks = trickDAO.getTrickByType(1);
//        //expandableListAdapter = new TrickExpandanbleAdapter(this, expandableListTitle, expandableListDetail);
//        expandableListAdapter = new TrickExpandanbleAdapter(this,tricks);
//        expandableListView.setAdapter(expandableListAdapter);

        trickTheory = findViewById(R.id.buttonMeoLT);
        trickPractice = findViewById(R.id.buttonMeoTH);

        trickTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricks = trickDAO.getTrickByType(1);
                expandableListAdapter = new TrickExpandanbleAdapter(TrickActivity.this,tricks);
                expandableListView.setAdapter(expandableListAdapter);
            }
        });

        trickPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricks = trickDAO.getTrickByType(2);
                expandableListAdapter = new TrickExpandanbleAdapter(TrickActivity.this,tricks);
                expandableListView.setAdapter(expandableListAdapter);
            }
        });

    }

}
