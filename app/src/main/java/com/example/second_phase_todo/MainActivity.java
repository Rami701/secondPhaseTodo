package com.example.second_phase_todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TodoFormDialogFragment todoFormDialogFragment = new TodoFormDialogFragment();
                todoFormDialogFragment.show(getSupportFragmentManager(), "form");
            }
        });

        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> details = new ArrayList<>();
        ArrayList<String> dates = new ArrayList<>();



        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ToDoAdapter adapter = new ToDoAdapter(titles, details, dates);
        recyclerView.setAdapter(adapter);

    }

    private void setUpViews() {
        recyclerView = findViewById(R.id.rv);
        fab = findViewById(R.id.fab);
    }

    public void addTodo(String title, String details, String date){
        ToDoAdapter adapter = (ToDoAdapter) recyclerView.getAdapter();
        adapter.addItem(title, details, date);
    }

}