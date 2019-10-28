package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 static  Button buttonCat;
 private static ImageView imageView;
  private int currentImage;
  int[] images = {R.drawable.cat,R.drawable.cat2};
    public void catButton(View view){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }
    public void buttonClick() {
        buttonCat =findViewById(R.id.catButton);
        imageView = findViewById(R.id.catView);
        buttonCat.setOnClickListener((x)->{
            currentImage++;
            currentImage = currentImage % images.length;
            imageView.setImageResource(images[currentImage]);
        } );
    }
}
