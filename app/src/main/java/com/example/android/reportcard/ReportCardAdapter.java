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
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, ReportCards);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.reportcardlist, parent, false);
        }

        // Get the {@link ReportCard} object located at this position in the list
        ReportCard currentReportCard = getItem(position);

        // Find the TextView in the reportcardlist.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.studentname);
        // Get the version name from the current ReportCard object and
        // set this text on the name TextView
        nameTextView.setText(currentReportCard.getStudentName());

        // Find the TextView in the reportcardlist.xml layout with the ID version_number
        TextView courseTextView = (TextView) listItemView.findViewById(R.id.coursename);
        // Get the version name from the current ReportCard object and
        // set this text on the name TextView
        courseTextView.setText(currentReportCard.getCourseName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.coursescore);
        // Get the version name from the current ReportCard object and
        // set this text on the name TextView
        scoreTextView.setText(currentReportCard.getCourseScore());

        // Return the whole list item layout (containing 3TextViews )
        // so that it can be shown in the ListView
        return listItemView;
    }
}
