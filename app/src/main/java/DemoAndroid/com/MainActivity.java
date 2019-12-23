package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           final Handler handler = new Handler();
            Runnable run =  new Runnable() {
                @Override
                public void run() {
                  // insert code to be run every seconds

                    Log.i("Runnable has run !", "a second must have passed");
                  handler.postDelayed(this,1000);
                }
            };
            handler.post(run);
           }


    }
