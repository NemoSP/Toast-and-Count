package com.sp.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.sp.hellotoast.R;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);

        Button toastButton = findViewById(R.id.button_toast);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sajan Paul- 2030880", Toast.LENGTH_SHORT).show();
                mCount = 0;
                mShowCount.setText(String.valueOf(mCount));
            }
        });

        Button countButton = findViewById(R.id.button_count);
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                mShowCount.setText(String.valueOf(mCount));
            }
        });
    }
}
