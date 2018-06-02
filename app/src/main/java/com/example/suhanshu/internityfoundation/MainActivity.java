package com.example.suhanshu.internityfoundation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);

    }


    public void open_activityB(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, 121);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 121 && resultCode == RESULT_OK) {

            textView.setText(data.getStringExtra("name"));

        }
    }
}
