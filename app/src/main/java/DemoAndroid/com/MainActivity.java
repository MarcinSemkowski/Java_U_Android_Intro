package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList();
        myFamily.add("Rob");
        myFamily.add("Kristen");
        myFamily.add("Tommy");
        myFamily.add("Ralphie");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myFamily);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(

                (parent, view, position, id) -> {
                    Log.i("Person tapped: " , myFamily.get(position));

                }

        );

    }
}