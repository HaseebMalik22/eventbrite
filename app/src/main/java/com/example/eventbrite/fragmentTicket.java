package com.example.eventbrite;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class fragmentTicket extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tickets);


        RecyclerView recyclerView = findViewById(R.id.ticketsRecycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerTicketAdapter adapter = new RecyclerTicketAdapter(this);
        recyclerView.setAdapter(adapter);



    }
}
