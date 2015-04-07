package com.test.jamestt.testapp2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextview);
        final Button showFactbutton = (Button) findViewById(R.id.showFactbutton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);


        //Create/set on click listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Update TextView when Button Clicked
                String fact = mFactbook.getFact();
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactbutton.setTextColor(color);
            }
        };

        //Attach on click listener to button
        showFactbutton.setOnClickListener(listener);
    }
}
