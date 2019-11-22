package com.food.customrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<PersonUtils> personUtilsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        personUtilsList = new ArrayList<>();

        //Adding Data into ArrayList

        String img1 = String.valueOf(R.drawable.image1);
        String img2 = String.valueOf(R.drawable.image2);

        personUtilsList.add(new PersonUtils("Todd Miller","Ahmedabad","101",img1));
        personUtilsList.add(new PersonUtils("Bradley Matthews","Rajkot","102",img2));
        personUtilsList.add(new PersonUtils("Harley Gibson","Surat","103",img1));
        personUtilsList.add(new PersonUtils("Gary Thompson","Rajkot","104",img2));
        personUtilsList.add(new PersonUtils("Corey Williamson","Vapi","105",img1));
        personUtilsList.add(new PersonUtils("Samuel Jones","Vaslad","106",img2));
        personUtilsList.add(new PersonUtils("Michael Read","Baroda","107",img1));
        personUtilsList.add(new PersonUtils("Robert Phillips","Bharush","108",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Mumbai","109",img1));
        personUtilsList.add(new PersonUtils("Wayne Diaz","Goa","110",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Pune","111",img1));
        personUtilsList.add(new PersonUtils("Albert Stewart","Hyderabad","112",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Delhi","113",img1));
        personUtilsList.add(new PersonUtils("Albert Stewart","Nashik","114",img1));
        personUtilsList.add(new PersonUtils("Albert Stewart","Thane","115",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Vashim","116",img1));
        personUtilsList.add(new PersonUtils("Albert Stewart","Rajkot","117",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Mumbai","118",img1));
        personUtilsList.add(new PersonUtils("Albert Stewart","Ahmedabad","119",img2));
        personUtilsList.add(new PersonUtils("Albert Stewart","Mumbai","120",img1));



        mAdapter = new CustomRecyclerAdapter(this, personUtilsList);

        recyclerView.setAdapter(mAdapter);

    }
}

