package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etInput;
    private TextView textView;
    private RadioGroup radioGroup;
    private Double Temperature=0.0;
    private  Double get_input = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput=findViewById(R.id.et_Input);
        textView=findViewById(R.id.tv);
        radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_c:
                        getConvertFrom_F_or_c(2);
                        break;
                    case R.id.radio_f:
                        getConvertFrom_F_or_c(1);
                        break;
                }
            }
        });

    }
    public void getTemperature(View view) {

        if (!etInput.getText().toString().equals("")) {
            get_input = Double.valueOf(etInput.getText().toString());
        }else {
            Toast.makeText(this, "Pleas Enter The Temperature", Toast.LENGTH_SHORT).show();

        }
        textView.setText(String.valueOf(Temperature));
    }
    public void getConvertFrom_F_or_c(int f_or_c){
        switch (f_or_c){
            case 1:
                Temperature=get_input*9/5+32;
                break;
            case 2:
                Temperature=(get_input-32)*5/9;
                break;
        }

    }

}