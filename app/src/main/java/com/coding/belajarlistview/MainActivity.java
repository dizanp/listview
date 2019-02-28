package com.coding.belajarlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    private String[] makanan = {"Mie ayam",
                                "Bakso",
                                "Nasi goreng",
                                "Soto",
                                "Rendang"};
    //array list digunakan untuk menampung data-data array yang kita buat
    private ArrayList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();
        //Array Adapter berfungsi untuk mengatur item yang ada di listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.support_simple_spinner_dropdown_item,data);
        lv.setAdapter(adapter);

        //membuat listnere untuk menangani aksi ketika salah satu item di klik

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String getName = data.get(position);

                Intent sendData = new Intent(MainActivity.this, DetailActivity.class);

                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    public void getData(){
        //mengambil semua data makanan ke dalam arraylist
        Collections.addAll(data, makanan);
    }
}
