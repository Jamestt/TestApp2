package com.test.jamestt.testapp2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextview);
        Button showFactbutton = (Button) findViewById(R.id.showFactbutton);

        //Create/set on click listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Update TextView when Button Clicked
                Random NumberGenerator = new Random();
                int RandomNumber = NumberGenerator.nextInt(3);
                String[] facts = {
                        "Ants Strech when they wake up in the morning",
                        "Ostriches can run faster than horses",
                        "Olympic gold medals are made mostly of silver",
                        "Sadly there was an error producing the random number"
                };

                if(RandomNumber == 0){
                    factLabel.setText(facts[0]);
                }else if(RandomNumber == 1){
                    factLabel.setText(facts[1]);
                }else if(RandomNumber == 2){
                    factLabel.setText(facts[2]);
                }else{
                    factLabel.setText(facts[3]);
                }
            }
        };
        showFactbutton.setOnClickListener(listener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
