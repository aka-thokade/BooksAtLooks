package com.example.studymaterial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    ListView pdfListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        pdfListView=(ListView) findViewById(R.id.myPDFList);

        String[] pdfFiles ={"8051 Microcontroller Basics","ATMega328P","Beams and Support and Support Reaction","Bluetooth Communication","Centre of Gravity & Centroid - Notes and Numerical","Communication I2C","Comparison of RS232, I2C and SPI","Electronics For Robotics"
        ,"GENERAL COMMUNICATION","GSM Protocol","Interfacing GSM Module to Arduino Uno","Intro to Robotics","Introduction to Robotics","LCD interfacing","Mechanics 1","Mechanics 2","Mechanics 3","Mechanics 4","Mechanics 5","Mechanics 6","Memory map and Addressing modes ATmega"
                ,"Moment of Inertia","PLC SCADA","Relay module interfacing and programming","Robot Kinematics 1","Robot Kinematics 2","RS-232C Serial Communication","Segment display","Serial Peripheral Interface","Wi-Fi  Communication"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l) {
                String item = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });


    }
}
