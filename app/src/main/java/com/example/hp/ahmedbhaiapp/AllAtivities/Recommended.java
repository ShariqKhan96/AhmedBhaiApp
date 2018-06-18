package com.example.hp.ahmedbhaiapp.AllAtivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.ahmedbhaiapp.Adapters.CustomerHistoryAdapter;
import com.example.hp.ahmedbhaiapp.Common.common;
import com.example.hp.ahmedbhaiapp.R;

public class Recommended extends AppCompatActivity {


    RecyclerView recyclerView;
    CustomerHistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);

        recyclerView = findViewById(R.id.recommende_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomerHistoryAdapter(common.initList(), this);
        recyclerView.setAdapter(adapter);

    }
}
