package com.ecommerce.bitirme.ecommerce.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ecommerce.bitirme.ecommerce.R;

public class AllAdvertsActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        txt=(TextView)findViewById(R.id.tv1);
        Bundle extras = getIntent().getExtras();
        if(extras.getString("session")=="Ev İlanları") {
            setContentView(R.layout.evilan);
        }
        else if(extras.getString("session")=="Araba İlanları"){
            setContentView(R.layout.arabailan);
        }
      /*  txt.setText(extras.getString("session"))   ;
setTitle(extras.getString("session"));*/

    }
}
