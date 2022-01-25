package com.example.simpleparadox.listycity;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
public class ShowActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TextView textView;
        Button button;
         Bundle bundle = getIntent().getExtras();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setText("Back");
       textView.setText(bundle.getString("cityname"));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowActivity.this.finish();
            }
        });

    }
}
