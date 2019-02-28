package com.coding.belajarlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvnama,tvharga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Data Makanan");
        tvnama =(TextView) findViewById(R.id.getnama);
        tvharga =(TextView) findViewById(R.id.getharga);
        showData();
    }
    private void showData(){
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama){
            case "Mie ayam":
                tvnama.setText("Mie Ayam");
                tvharga.setText("10000");
                break;
            case "Bakso":
                tvnama.setText("Bakso");
                tvharga.setText("15000");
                break;
            case "Nasi goreng":
                tvnama.setText("Nasi Goreng");
                tvharga.setText("8000");
                break;
            case "Soto":
                tvnama.setText("Soto");
                tvharga.setText("11000");
                break;
            case "Rendang":
                tvnama.setText("Rendang");
                tvharga.setText("10000");
                break;
        }
    }
}