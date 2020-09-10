package my.xo.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.xo.R;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(splash.this, "!!!RULES!!!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(splash.this, first.class));
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}