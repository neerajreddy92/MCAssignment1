package com.mobile.bolt.assign1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button.*;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.*;
import android.widget.TextView;

/**
 * GraphViewDemo creates some dummy data to demonstrate the GraphView component.
 * @author Arno den Hond
 *
 */
public class GraphViewDemo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        float[] values = new float[] { 2.0f,1.5f, 2.5f, 1.0f , 3.0f };
        String[] verlabels = new String[] { "great", "ok", "bad" };
        String[] horlabels = new String[] { "today", "tomorrow", "next week", "next month" };
        GraphView graphView = new GraphView(this, values, "GraphViewDemo",horlabels, verlabels, GraphView.LINE);
        LinearLayout layout_horizontal = new LinearLayout(this);
        LinearLayout layout_vertical = new LinearLayout(this);
        layout_horizontal.setOrientation(LinearLayout.HORIZONTAL);
        layout_vertical.setOrientation(LinearLayout.VERTICAL);
        layout_vertical.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        EditText patientId = new EditText(this);
        patientId.setText("Patient Id");
        EditText patientName = new EditText(this);
        patientName.setText("Name");
        EditText patientAge = new EditText(this);
        patientAge.setText("Age");


        Button btn= new Button(this);
        btn.setText("START");
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //your write code
            }
        });
        Button btn1= new Button(this);
        btn1.setText("STOP");
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //your write code
            }
        });
        layout_horizontal.addView(patientId);
        layout_horizontal.addView(patientName);
        layout_horizontal.addView(patientAge);
        layout_horizontal.addView(btn);
        layout_horizontal.addView(btn1);
        layout_vertical.addView(layout_horizontal);
        layout_vertical.addView(graphView);
        setContentView(layout_vertical);
    }
}