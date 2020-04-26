package com.example.studymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem=getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Arrays")){
            myPDFViewer.fromAsset("Arrays.pdf").load();
        }
        if(getItem.equals("Conditional statements")){
            myPDFViewer.fromAsset("Conditional statements (Decision making).pdf").load();
        }
        if(getItem.equals("Data Handling")){
            myPDFViewer.fromAsset("Data Handling.pdf").load();
        }
        if(getItem.equals("Flow control and Loops")){
            myPDFViewer.fromAsset("Flow control and Loops.pdf").load();
        }
        if(getItem.equals("Functions")){
            myPDFViewer.fromAsset("Functions.pdf").load();
        }
        if(getItem.equals("Functions and Modules")){
            myPDFViewer.fromAsset("Functions and Modules.pdf").load();
            ;
        }
        if(getItem.equals("PYTHON PACKAGES")){
            myPDFViewer.fromAsset("PYTHON PACKAGES.pdf").load();
        }
        if(getItem.equals("Python 3 for Absolute Beginners")){
            myPDFViewer.fromAsset("Python 3 for Absolute Beginners.pdf").load();
        }

        if(getItem.equals("Vector Calculus with applications")){
            myPDFViewer.fromAsset("Vector Calculus with applications.pdf").load();
        }
        if(getItem.equals("Taylor Series")){
            myPDFViewer.fromAsset("Taylor Series.pdf").load();
        }
        if(getItem.equals("Introduction to Robotics")){
            myPDFViewer.fromAsset("Introduction to Robotics.pdf").load();
        }
        if(getItem.equals("Centre of Gravity & Centroid")){
            myPDFViewer.fromAsset("Centre of Gravity & Centroid - Notes and Numerical.pdf").load();
        }
        if(getItem.equals("Electronics For Robotics")){
            myPDFViewer.fromAsset("Electronics For Robotics2.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  1")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  1.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  2")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  2.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  3")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  3.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  4")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  4.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  5")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  5.pdf").load();
        }
        if(getItem.equals("Eigen Values and Eigen Vectors  6")){
            myPDFViewer.fromAsset("Eigen Values and Eigen Vectors  6.pdf").load();
        }
        if(getItem.equals("Linear Transformation  1")){
            myPDFViewer.fromAsset("Linear Transformation  1.pdf").load();
        }
        if(getItem.equals("Linear Transformation  2")){
            myPDFViewer.fromAsset("Linear Transformation  2.pdf").load();
        }
        if(getItem.equals("Linear Transformation  3")){
            myPDFViewer.fromAsset("Linear Transformation  3.pdf").load();
        }
        if(getItem.equals("Linear Transformation  4")){
            myPDFViewer.fromAsset("Linear Transformation  4.pdf").load();
        }
        if(getItem.equals("Linear Transformation  5")){
            myPDFViewer.fromAsset("Linear Transformation  5.pdf").load();
        }
        if(getItem.equals("Linear Transformation  6")){
            myPDFViewer.fromAsset("Linear Transformation  6.pdf").load();
        }
        if(getItem.equals("Random Variables 1")){
            myPDFViewer.fromAsset("Random Variables 1.pdf").load();
        }
        if(getItem.equals("Random Variables 2")){
            myPDFViewer.fromAsset("Random Variables 2.pdf").load();
        }
        if(getItem.equals("Random Variables 3")){
            myPDFViewer.fromAsset("Random Variables 3.pdf").load();
        }
        if(getItem.equals("Random Variables 4")){
            myPDFViewer.fromAsset("Random Variables 4.pdf").load();
        }
        if(getItem.equals("Random Variables 5")){
            myPDFViewer.fromAsset("Random Variables 5.pdf").load();
        }
        if(getItem.equals("Random Variables 6")){
            myPDFViewer.fromAsset("Random Variables 6.pdf").load();
        }
        if(getItem.equals("8051 Microcontroller Basics")){
            myPDFViewer.fromAsset("8051 Microcontroller Basics.pdf").load();
        }
        if(getItem.equals("ATMega328P")){
            myPDFViewer.fromAsset("ATMega328P.pdf").load();
        }
        if(getItem.equals("Beams and Support and Support Reaction")){
            myPDFViewer.fromAsset("Beams and Support and Support Reaction.pdf").load();
        }
        if(getItem.equals("Bluetooth Communication")){
            myPDFViewer.fromAsset("Bluetooth Communication.pdf").load();
        }
        if(getItem.equals("Centre of Gravity & Centroid - Notes and Numerical")){
            myPDFViewer.fromAsset("Centre of Gravity & Centroid - Notes and Numerical.pdf").load();
        }
        if(getItem.equals("Communication I2C")){
            myPDFViewer.fromAsset("Communication I2C.pdf").load();
        }
        if(getItem.equals("Comparison of RS232, I2C and SPI")){
            myPDFViewer.fromAsset("Comparison of RS232, I2C and SPI.pdf").load();
        }
        if(getItem.equals("GENERAL COMMUNICATION")){
            myPDFViewer.fromAsset("GENERAL COMMUNICATION.pdf").load();
        }
        if(getItem.equals("Random Variables 6")){
            myPDFViewer.fromAsset("Random Variables 6.pdf").load();
        }
        if(getItem.equals("GSM Protocol")){
            myPDFViewer.fromAsset("GSM Protocol.pdf").load();
        }
        if(getItem.equals("Interfacing GSM Module to Arduino Uno")){
            myPDFViewer.fromAsset("Interfacing GSM Module to Arduino Uno.pdf").load();
        }
        if(getItem.equals("Intro to Robotics")){
            myPDFViewer.fromAsset("Intro to Robotics.pdf").load();
        }
        if(getItem.equals("LCD interfacing")){
            myPDFViewer.fromAsset("LCD interfacing.pdf").load();
        }
        if(getItem.equals("Mechanics 1")){
            myPDFViewer.fromAsset("Mechanics 1.pdf").load();
        }
        if(getItem.equals("Mechanics 2")){
            myPDFViewer.fromAsset("Mechanics 2.pdf").load();
        }
        if(getItem.equals("Mechanics 3")){
            myPDFViewer.fromAsset("Mechanics 3.pdf").load();
        }
        if(getItem.equals("Mechanics 4")){
            myPDFViewer.fromAsset("Mechanics 4.pdf").load();
        }
        if(getItem.equals("Mechanics 5")){
            myPDFViewer.fromAsset("Mechanics 5.pdf").load();
        }
        if(getItem.equals("Mechanics 6")){
            myPDFViewer.fromAsset("Mechanics 6.pdf").load();
        }
        if(getItem.equals("Memory map and Addressing modes ATmega")){
            myPDFViewer.fromAsset("Memory map and Addressing modes ATmega.pdf").load();
        }
        if(getItem.equals("Moment of Inertia")){
            myPDFViewer.fromAsset("Moment of Inertia.pdf").load();
        }
        if(getItem.equals("PLC SCADA")){
            myPDFViewer.fromAsset("PLC SCADA.pdf").load();
        }
        if(getItem.equals("Relay module interfacing and programming")){
            myPDFViewer.fromAsset("Relay module interfacing and programming.pdf").load();
        }
        if(getItem.equals("Robot Kinematics 1")){
            myPDFViewer.fromAsset("Robot Kinematics 1.pdf").load();
        }
        if(getItem.equals("Robot Kinematics 2")){
            myPDFViewer.fromAsset("Robot Kinematics 2.pdf").load();
        }
        if(getItem.equals("RS-232C Serial Communication")){
            myPDFViewer.fromAsset("RS-232C Serial Communication.pdf").load();
        }
        if(getItem.equals("Segment display")){
            myPDFViewer.fromAsset("Segment display.pdf").load();
        }
        if(getItem.equals("Serial Peripheral Interface")){
            myPDFViewer.fromAsset("Serial Peripheral Interface.pdf").load();
        }
        if(getItem.equals("Wi-Fi  Communication")){
            myPDFViewer.fromAsset("Wi-Fi  Communication.pdf").load();
        }
        if(getItem.equals("Modules in python")){
            myPDFViewer.fromAsset("Modules in python.pdf").load();
        }
        if(getItem.equals("Python Functions")){
            myPDFViewer.fromAsset("Python Functions.pdf").load();
        }
        if(getItem.equals("Python Modules")){
            myPDFViewer.fromAsset("Python Modules.pdf").load();
        }
        if(getItem.equals("Introduction to C")){
            myPDFViewer.fromAsset("Introduction to C.pdf").load();
        }

    }
}
