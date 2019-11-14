package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mPlayer = MediaPlayer.create(this,R.raw.song);

        mPlayer.start();

        // "Music: www.bensound.com"

    }

}
