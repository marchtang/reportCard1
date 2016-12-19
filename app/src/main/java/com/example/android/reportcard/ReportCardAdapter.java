package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by march on 2016/12/15.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> ReportCards) {

        super(context, 0, ReportCards);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.reportcardlist, parent, false);
        }
        ReportCard currentReportCard = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.studentname);
        nameTextView.setText(currentReportCard.getStudentName());
        TextView courseTextView = (TextView) listItemView.findViewById(R.id.coursename);
        courseTextView.setText(currentReportCard.getCourseName());
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.coursescore);
        scoreTextView.setText(currentReportCard.getCourseScore());
        return listItemView;
    }
}
