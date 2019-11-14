package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;
    private AudioManager audioManager;

    public void playAudio(View view) {

        mPlayer.start();

        // "Music: www.bensound.com"
    }

    public void pauseAudio(View view) {
        mPlayer.pause();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayer = MediaPlayer.create(this, R.raw.song);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);


        SeekBar volumeControl = findViewById(R.id.seekBar);

        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(currentVolume);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(
                                                 ) {
                                                     @Override
                                                     public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                                                         Log.i("SeekBar value", Integer.toString(progress));
                                                         audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
                                                     }

                                                     @Override
                                                     public void onStartTrackingTouch(SeekBar seekBar) {

                                                     }

                                                     @Override
                                                     public void onStopTrackingTouch(SeekBar seekBar) {

                                                     }


                                                 }
        );
    }

}
