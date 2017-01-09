package com.example.workstationantoni.devinenombreappli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random rand = new Random();
    int NbMyst = rand.nextInt(100);


    public void click(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        if (editText == ""){

        }else{
            int NbTest = new Integer(editText.getText().toString());

            if (NbTest == NbMyst){
                String blabla = String.valueOf(NbMyst);
                Toast.makeText(getApplicationContext(),"GG Victoire le chiffre etait "+blabla ,Toast.LENGTH_SHORT).show();
            }else if (NbTest < NbMyst) {
                Toast.makeText(getApplicationContext(),"Trop petit" ,Toast.LENGTH_SHORT).show();
            }else if (NbTest > NbMyst) {
                Toast.makeText(getApplicationContext(),"Trop grand" ,Toast.LENGTH_SHORT).show();
            }
        }
    }
}
