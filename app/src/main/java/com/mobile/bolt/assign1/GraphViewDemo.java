package com.mobile.bolt.assign1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.*;
import android.widget.RadioButton;

/**
 * GraphViewDemo creates some dummy data to demonstrate the GraphView component.
 * @author Arno den Hond
 * @edit Neeraj chinthireddy
 */
public class GraphViewDemo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        float[] values = new float[] { 2.0f,1.5f, 2.5f, 1.0f , 3.0f };
        String[] verlabels = new String[] { "great", "ok", "bad" };
        String[] horlabels = new String[] { "today", "tomorrow", "next week", "next month" };
        GraphView graphView = new GraphView(this, values, "GraphViewDemo",horlabels, verlabels, GraphView.LINE);
        final LinearLayout layout_horizontal = new LinearLayout(this);
        final LinearLayout layout_vertical = new LinearLayout(this);
        layout_horizontal.setOrientation(LinearLayout.HORIZONTAL);
//        layout_horizontal.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        layout_vertical.setOrientation(LinearLayout.VERTICAL);
        layout_vertical.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        EditText patientId = new EditText(this);
        patientId.setText("Patient Id");
        EditText patientName = new EditText(this);
        patientName.setText("Name");
        EditText patientAge = new EditText(this);
        patientAge.setText("Age");
        RadioButton radio1 = new RadioButton(this);
        radio1.setText("male");
//        radio1.setId("rbtn" );
        RadioButton radio2 = new RadioButton(this);
        radio2.setText("female");
        Button btn= new Button(this);
        btn.setText("START");
        Button btn1= new Button(this);
        btn1.setText("STOP");
        layout_horizontal.addView(patientId);
        layout_horizontal.addView(patientName);
        layout_horizontal.addView(patientAge);
        layout_horizontal.addView(radio1);
        layout_horizontal.addView(radio2);
        layout_horizontal.addView(btn);
        layout_horizontal.addView(btn1);
        layout_vertical.addView(layout_horizontal);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(layout_vertical);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout_vertical.removeAllViews();
                layout_vertical.addView(layout_horizontal);
                setContentView(layout_vertical);
            }
        });

        layout_vertical.addView(graphView);
        setContentView(layout_vertical);
    }
}