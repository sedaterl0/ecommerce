package com.ecommerce.bitirme.ecommerce.Activity;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.ecommerce.bitirme.ecommerce.R;

public class AddAdvert extends AppCompatActivity {
    TextView ilan;
    ArrayAdapter<String> arrayAdapter;

    String[] ilantipi = new String[]{"Satılık", "Kiralık", "Günlük Kiralık", "Devren Satılık"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_advert);
        TextView ilanadi = (TextView) findViewById(R.id.ilanadi);
        Bundle extras = getIntent().getExtras();
        ilanadi.setText(extras.getString("session"));
        ilanadi.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, ilantipi);
        

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                  ilan.setText(adapterView.getSelectedItem().toString());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}