package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Rodwin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Created Na Daw!", Toast.LENGTH_SHORT).show();
        Rodwin = (TextView) findViewById(R.id.RodwinTV);
        Rodwin.setText("Created app");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Started Na Daw!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume Na Daw!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause Muna Daw!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop Muna Daw!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart Muna Daw!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy Na Daw!", Toast.LENGTH_SHORT).show();
    }

}
