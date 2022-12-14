package br.fmu.projetoaulam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipCalculator(View view) {
        Intent intent = new Intent(this, TipCalculatorActivity.class);
        startActivity(intent);
    }

    public void abrirDesenho(View view) {
        Intent intent = new Intent(this, DesenhoActivity.class );
        startActivity(intent);
    }

    public void abrirTesteSensores(View view) {
        Intent intent = new Intent( this, SensorActivity.class);
        startActivity(intent);
    }

    public void abirTesteBD( View view ) {
        Intent intent = new Intent( this, TesteBDActivity.class);
        startActivity(intent);
    }

    public void abrirTesteTcp( View view ) {
        Intent intent = new Intent( this, TesteTCPActivity.class);
        startActivity(intent);
    }

}