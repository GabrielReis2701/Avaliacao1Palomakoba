package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_ValorJardas;
    Button bt_Converte;
    TextView tv_ValorCenti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ValorJardas = findViewById(R.id.et_ValorJardas);
        bt_Converte = findViewById(R.id.bt_Converte);
        tv_ValorCenti = findViewById(R.id.tv_ValorCenti);

        bt_Converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorJ = Double.parseDouble(et_ValorJardas.getText().toString());
                double valorC = valorJ*91.44;
                tv_ValorCenti.setText("Valor em Centimentros é: "+valorC);
            }
        });
    }
}