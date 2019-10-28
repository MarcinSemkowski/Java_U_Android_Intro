package DemoAndroid.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText myTextField =  findViewById(R.id.UserTextField);
        EditText myPasswordText = findViewById(R.id.passwordText);

        Log.i("UserName",myTextField.getText().toString());
        Log.i("Password",myPasswordText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
