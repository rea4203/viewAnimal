package com.example.project_322_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1, rd2, rd3, rd4;
    RadioGroup rdg1;
    Button bt1;
    View dogV, catV, rabV, horseV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1 = (RadioButton) findViewById(R.id.rd1);
        rd2 = (RadioButton) findViewById(R.id.rd2);
        rd3 = (RadioButton) findViewById(R.id.rd3);
        rd4 = (RadioButton) findViewById(R.id.rd4);
        rdg1 = (RadioGroup) findViewById(R.id.rdg1);
        bt1 = (Button) findViewById(R.id.bt1);

        dogV = (View) View.inflate(MainActivity.this, R.layout.dog, null);
        catV = (View) View.inflate(MainActivity.this, R.layout.cat, null);
        rabV = (View) View.inflate(MainActivity.this, R.layout.rab, null);
        horseV = (View) View.inflate(MainActivity.this, R.layout.horse, null);

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch(rdg1.getCheckedRadioButtonId()) {

                    case R.id.rd1:
                        AlertDialog.Builder dlg1 = new AlertDialog.Builder (MainActivity.this);
                        dlg1.setTitle("강아지");
                        dlg1.setView(dogV);
                        dlg1.setNegativeButton("이전", null);
                        dlg1.show();
                        break;
                    case R.id.rd2:
                        AlertDialog.Builder dlg2 = new AlertDialog.Builder (MainActivity.this);
                        dlg2.setTitle("고양이");
                        dlg2.setView(catV);
                        dlg2.setNegativeButton("이전", null);
                        dlg2.show();
                        break;
                    case R.id.rd3:
                        AlertDialog.Builder dlg3 = new AlertDialog.Builder (MainActivity.this);
                        dlg3.setTitle("토끼");
                        dlg3.setView(rabV);
                        dlg3.setNegativeButton("이전", null);
                        dlg3.show();
                        break;
                    case R.id.rd4:
                        AlertDialog.Builder dlg4 = new AlertDialog.Builder (MainActivity.this);
                        dlg4.setTitle("말");
                        dlg4.setView(horseV);
                        dlg4.setNegativeButton("이전", null);
                        dlg4.show();
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "선택하세요", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}