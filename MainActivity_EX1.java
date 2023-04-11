package com.example.tp4_img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView _txtTaille ;
    TextView _txtPoids ;
    TextView _txtAge ;
    TextView _lblResultat1 ;
    TextView _lblInterpretation ;
    TextView _lblResultat ;
    TextView _lblInterpretation1 ;
    TextView _res ;
    EditText _txtTaille1 ;
    EditText _txtPoids1 ;
    EditText _txtAge1 ;
    Button _btnCalculIMG ;
    RadioButton _rdbHomme ;
    RadioButton _rdbFemme ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtTaille=(TextView)findViewById(R.id.txtTaille);
        _txtPoids=(TextView)findViewById(R.id.txtPoids);
        _txtAge=(TextView)findViewById(R.id.txtAge);
        _lblResultat1=(TextView)findViewById(R.id.lblResultat1);
        _lblInterpretation=(TextView)findViewById(R.id.lblInterpretation);
        _lblResultat=(TextView)findViewById(R.id.lblResultat);
        _lblInterpretation1=(TextView)findViewById(R.id.lblInterpretation1);
        _res=(TextView)findViewById(R.id.res);
        _txtTaille1=(EditText)findViewById(R.id.txtTaille1);
        _txtPoids1=(EditText)findViewById(R.id.txtPoids1);
        _txtAge1=(EditText)findViewById(R.id.txtAge1);
        _btnCalculIMG=(Button)findViewById(R.id.btnCalculIMG);
        _rdbHomme=(RadioButton)findViewById(R.id.rdbHomme);
        _rdbFemme=(RadioButton)findViewById(R.id.rdbFemme);
        _btnCalculIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_txtTaille1.getText().toString().equals("") || _txtAge1.getText().toString().equals("") || _txtPoids1.getText().toString().equals(""))
                    return;
                float img ;
                int  sexe ;
                float IMC ;
                IMC = _txtPoids1/_txtTaille1 ;
                if (_rdbFemme)
                    sexe=0;
                if (_rdbHomme)
                    sexe=1;
                if (_txtAge1>=16)
                    img=Float.parseFloat((1.20*IMC)+(0.23*Float.parseFloat(_txtAge1.getText().toString()))-(10.8*sexe)-5.4);
                if (_txtAge1=<15)
                    img=Float.parseFloat((1.51*IMC)+(0.70*(Float.parseFloat(_txtAge1.getText().toString())))-(0.36*sexe)+1.4);

            }
        });

    }
}