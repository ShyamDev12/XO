package my.xo.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xo.R;

public class first extends AppCompatActivity {
    TextView mrules;
    Button mstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mstart = findViewById(R.id.startBtn);
        mrules = findViewById(R.id.Rules);
        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(first.this, "!!THE GAME BEGINS!!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(first.this, MainActivity.class));
            }
        });




    }
}