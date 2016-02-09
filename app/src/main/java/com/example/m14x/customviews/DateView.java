package com.example.m14x.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by m14x on 09/02/2016.
 */
public class DateView extends TextView {

    public DateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DateView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DateView(Context context) {
        super(context);
        initDateTV();
    }

    private void initDateTV() {
        TextView mTxtViewDate = (TextView) findViewById(R.id.TxtDate);
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

        this.setText(date);
    }
}
