package com.bdadev.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Item mitem;
    private ArrayList<Item> listitem;
    private ItemAdapter mitemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        listitem = new ArrayList<>();
        data();
        mitemAdapter = new ItemAdapter(listitem,this);
        recyclerView.setAdapter(mitemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void data(){
        listitem.add(new Item("item1",R.drawable.react));
        listitem.add(new Item("item2",R.drawable.react));
        listitem.add(new Item("item3",R.drawable.react));
        listitem.add(new Item("item4",R.drawable.react));
        listitem.add(new Item("item5",R.drawable.react));
    }
}