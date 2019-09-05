package com.example.tugasluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputPanjang, inputLebar;
    private Button tombolHitung;
    private TextView teksHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
        tombolHitung = findViewById(R.id.tombolHitung);
        teksHasil = findViewById(R.id.teksHasil);

        getSupportActionBar().setTitle("Kalkulator Luas Persegi");

        tombolHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String panjang, lebar;
                panjang = inputPanjang.getText().toString();
                lebar = inputLebar.getText().toString();

                if(TextUtils.isEmpty(panjang)){
                    inputPanjang.setError("Isi anjing!");
                    inputPanjang.requestFocus();
                }else if(TextUtils.isEmpty(lebar)){
                    inputLebar.setError("Isi anjing!");
                    inputLebar.requestFocus();
                }else{
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = p*l;

                    teksHasil.setText("Hasil = " + hasil);
                }
            }
        });
    }
}
