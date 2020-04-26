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

public class Activity3 extends AppCompatActivity {
    ListView pdfListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        pdfListView=(ListView) findViewById(R.id.myPDFList);

        String[] pdfFiles ={"Vector Calculus with applications","Taylor Series","Eigen Values and Eigen Vectors  1","Eigen Values and Eigen Vectors  2","Eigen Values and Eigen Vectors  3","Eigen Values and Eigen Vectors  4"
        ,"Eigen Values and Eigen Vectors  5","Eigen Values and Eigen Vectors  6","Linear Transformation  1","Linear Transformation  2","Linear Transformation  3","Linear Transformation  4","Linear Transformation  5","Linear Transformation  6","Random Variables 1","Random Variables 2","Random Variables 3","Random Variables 4","Random Variables 5","Random Variables 6"};

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
