package com.example.eyevoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ToDoList extends AppCompatActivity {
    ListView l;
    String tutorials[]
            = { "Algorithms", "Data Structures",
            "Languages", "Interview Corner",
            "GATE", "ISRO CS",
            "UGC NET CS", "CS Subjects",
            "Web Technologies" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr= new ArrayAdapter<String>(this, R.layout.activity_to_do_list,tutorials);
        l.setAdapter(arr);
    }
}