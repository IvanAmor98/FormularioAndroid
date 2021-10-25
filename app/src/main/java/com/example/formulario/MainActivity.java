package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.submit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TextView output = findViewById(R.id.output);
        String res = "Nombre: " + ((TextView) findViewById(R.id.name)).getText();
        res += ", Apellidos: " + ((TextView) findViewById(R.id.surname)).getText();
        res += ", Edad: " + (((SeekBar) findViewById(R.id.age)).getProgress() + 13);
        res += ", Posicion: " + ((Spinner) findViewById(R.id.posicion)).getSelectedItem();
        res += ", Paga Seguro: " + (((CheckBox) findViewById(R.id.seguro)).isChecked() ? "Si" : "No");

        output.setText(res);
    }
}