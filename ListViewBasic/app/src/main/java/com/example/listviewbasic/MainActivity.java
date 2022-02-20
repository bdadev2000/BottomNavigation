package com.example.listviewbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ListView lv;
//    String[] myPhone = {"Oppo", "Vietel", "Xiaomi", "Samsung", "Iphone"};
//    ArrayAdapter<String> myAdapter;
    ArrayList<String> myPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        lv = (ListView) findViewById(R.id.lv);
        ArrayList<String> myPhone = new ArrayList<>();
        myPhone.add("Oppo");
        myPhone.add("Vietel");
        myPhone.add("Xiaomi");
        myPhone.add("Samsung");
        myPhone.add("Iphone");
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,myPhone);
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv.setText("Vi tri: " + i + ",ten hang: " + myPhone.get(i));
            }
        });
    }
}