package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;

     public  void generatedTimesTable(int timesTable){

         ArrayList<String> timesTableContent = new ArrayList<>();

         for(int i =1; i <=10; i++){
             timesTableContent.add(Integer.toString(i * timesTable));
         }

         ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,timesTableContent);
         listView.setAdapter(arrayAdapter);

     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         listView =  findViewById(R.id.myListView);
        SeekBar seekBar = findViewById(R.id.seekBar);


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
                 generatedTimesTable(timesTable);

                 Log.i("Seekbar Value", Integer.toString(timesTable));
               }

               @Override
               public void onStartTrackingTouch(SeekBar seekBar) {

               }

               @Override
               public void onStopTrackingTouch(SeekBar seekBar) {

               }
           });
            generatedTimesTable(10);


    }
}