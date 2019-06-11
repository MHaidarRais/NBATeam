package com.rais.haidar.nbateam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcView;
    private ArrayList<NbaTeam> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcView = findViewById(R.id.rcv);
        rcView.setHasFixedSize(true);

        list.addAll(NbaTeamData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rcView.setLayoutManager(new LinearLayoutManager(this));
        ListTeamAdapter listTeamAdapter= new ListTeamAdapter(this);
        listTeamAdapter.setListTeam(list);
        rcView.setAdapter(listTeamAdapter);

    }
}
