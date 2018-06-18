package com.example.hp.ahmedbhaiapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.ahmedbhaiapp.Adapters.CustomerHistoryAdapter;
import com.example.hp.ahmedbhaiapp.Common.common;
import com.example.hp.ahmedbhaiapp.R;

import java.util.zip.Inflater;


public class CustomerHistory extends Fragment {

    private RecyclerView recyclerView;
    private CustomerHistoryAdapter adapter;
//    private RecyclerView.LayoutManager layoutManager;


    public CustomerHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_customer_history, container, false);

        recyclerView = view.findViewById(R.id.customer_history_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        adapter = new CustomerHistoryAdapter(common.initList(), container.getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

}
