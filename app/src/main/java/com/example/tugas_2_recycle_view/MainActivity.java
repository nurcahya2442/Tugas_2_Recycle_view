package com.example.tugas_2_recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.LayoutManager mlayoutManager;
    private RecyclerView mRecyclerView;
    private List<list_name> listNames;
    private List_Adapter list_adapter;


    String []judul = {"Ardit" , "Herlangga", "Rere", "Nina", "Syifa"};

    String []time = {"10:00", "11:00","12:00", "13:00", "14:00"};

    String []isi = {"Hey, you Have New Assigment!", "Hey, you Have New Assigment!","Hey, you Have New Assigment!", "Hey, you Have New Assigment!", "Hey, you Have New Assigment!"};
    int[] pic = {
            R.drawable.a,
            R.drawable.h,
            R.drawable.r,
            R.drawable.n,
            R.drawable.s,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        if (mRecyclerView !=null){
            mRecyclerView.setHasFixedSize(true);
        }

        mlayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mlayoutManager);
        listNames = new ArrayList<>();

        for (int i = 0; i < judul.length; i++) {
            list_name listName = new list_name(judul[i], time[i], isi[i], pic[i]);
            listNames.add(listName);
        }

        list_adapter= new List_Adapter(listNames);
        mRecyclerView.setAdapter(list_adapter);
        list_adapter.notifyDataSetChanged();
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(MainActivity.this, "Card at " + position + " is clicked"
                                , Toast.LENGTH_SHORT).show();
                    }
                }));
    }



}
