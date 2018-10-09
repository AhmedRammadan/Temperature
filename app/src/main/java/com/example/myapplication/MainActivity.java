package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etInput;
private TextView textView;
private RadioGroup radioGroup;
private Button gettemperature;
private int input;
private int to_c;
private int to_f;
private char f_or_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput=findViewById(R.id.et_Input);
        textView=findViewById(R.id.tv);
        radioGroup=findViewById(R.id.radioGroup);
        gettemperature=findViewById(R.id.gettemperature);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_c:
                        int number= Integer.parseInt(etInput.getText().toString());
                        to_c=(number-32)*5/9;
                        textView.setText(""+to_c);
                        break;
                    case R.id.radio_f:
                        int number2= Integer.parseInt(etInput.getText().toString());
                        to_f=number2*5/9+32;
                        //textView.setText(""+to_f);
                        break;
                }
            }
        });

    }
    public void getTemperature(View view) {
        textView.setText(""+to_c);

        /*switch (f_or_c){
            case 'c':
                textView.setText(""+ getConvertFrom_F_to_c());
                break;
            case 'f':
               textView.setText(""+ getConvertFrom_c_to_F());
                break;
                default:
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

        }

*/

    }
    public int getConvertFrom_F_to_c(){
        String nn=etInput.getText().toString();
       int number= Integer.parseInt(nn);
        to_c=(number-32)*5/9;
        textView.setText(""+to_c);
       return to_c;
    }
    public int getConvertFrom_c_to_F(){
        String nn=etInput.getText().toString();
        int number= Integer.parseInt(nn);
        to_f=number*5/9+32;
        textView.setText(""+to_f);
        return to_f;

    }
}

