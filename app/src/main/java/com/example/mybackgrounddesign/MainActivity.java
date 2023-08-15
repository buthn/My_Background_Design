package com.example.mybackgrounddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.gender_id);

        ArrayAdapter<CharSequence> genderAdapterArry = ArrayAdapter.createFromResource
                (this,R.array.Gender,android.R.layout.simple_spinner_item);
        genderAdapterArry.setDropDownViewResource(R.layout.text_layout_spinner);
        spinner.setAdapter(genderAdapterArry);

    }
}