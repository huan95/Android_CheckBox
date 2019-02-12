package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbAndroid, cbIos, cbJava;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Check();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subjects = "Ban da chon mon hoc: \n";
                if (cbAndroid.isChecked()){
                    subjects += cbAndroid.getText() + "\n";
                }
                if (cbIos.isChecked()) {
                    subjects += cbIos.getText() + "\n";
                }
                if (cbJava.isChecked()) {
                    subjects += cbJava.getText() + "\n";
                }
                Toast.makeText(MainActivity.this, subjects, Toast.LENGTH_SHORT).show();
            }
        });

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Ban da chon Android", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Ban da bo chon Android", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Ban da chon IOS", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Ban da bo chon IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Ban da chon Java", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Ban da bo chon Java", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Check(){
        cbAndroid = (CheckBox) findViewById(R.id.checkbox1);
        cbIos = (CheckBox) findViewById(R.id.checkbox2);
        cbJava = (CheckBox) findViewById(R.id.checkbox3);
        btnClick = (Button) findViewById(R.id.btnClick);
    }
}
