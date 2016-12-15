package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ReportCard>ReportCards=new ArrayList<ReportCard>();
        ReportCards.add(new ReportCard("Tom","math",30));
        ReportCards.add(new ReportCard("Jack","math",99));
        ReportCards.add(new ReportCard("Sam","math",67));
        ReportCardAdapter repordcard=new ReportCardAdapter(this,ReportCards);
        ListView listView=(ListView)findViewById(R.id.listview_reportcard);
        listView.setAdapter(repordcard);
    }
}
