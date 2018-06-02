package com.example.suhanshu.internityfoundation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEditText=(EditText)findViewById(R.id.editText);
    }


    public void open_activityA(View view) {
        String text=mEditText.getText().toString();
        if(text!=null){
            Intent intent=new Intent();
            intent.putExtra("name",text);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}
