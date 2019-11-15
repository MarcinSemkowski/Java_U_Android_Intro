package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);
        SeekBar seekBar = findViewById(R.id.seekBar);
        ArrayList<Integer> listInteger  = new ArrayList<>();
        for(int i =0; i <= 220; i++){
            listInteger.add(i);
        }

        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listInteger);

        listView.setAdapter(arrayAdapter);

        seekBar.setMax(20);
        seekBar.setProgress(10);

           seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
               @Override
               public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 int min = 1;
                 int timesTable;
                 if(progress < min){
                     timesTable = min;
                     seekBar.setProgress(min);
                 }else{
                     timesTable = progress;
                 }

                 Log.i("Seekbar Value", Integer.toString(timesTable));
               }

               @Override
               public void onStartTrackingTouch(SeekBar seekBar) {

               }

               @Override
               public void onStopTrackingTouch(SeekBar seekBar) {

               }
           });





    }
}