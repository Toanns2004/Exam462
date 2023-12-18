package com.example.exam46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtKetQua, txtTinh;
    Button btnphanTram, btnEC, btnC, btnNhan, btnChia, btnCong, btnTru,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0,btnPhay, btnBang;


    private String number= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        btn0.setOnClickListener(view -> click("0"));
        btn1.setOnClickListener(view -> click("1"));
        btn2.setOnClickListener(view -> click("2"));
        btn3.setOnClickListener(view -> click("3"));
        btn4.setOnClickListener(view -> click("4"));
        btn5.setOnClickListener(view -> click("5"));
        btn6.setOnClickListener(view -> click("6"));
        btn7.setOnClickListener(view -> click("7"));
        btn8.setOnClickListener(view -> click("8"));
        btn9.setOnClickListener(view -> click("9"));


    }

    private void anhXa(){
        txtKetQua = findViewById(R.id.textViewKq);
        txtTinh = findViewById(R.id.textViewTinh);
        btnphanTram = findViewById(R.id.buttonPhanTram);
        btnEC = findViewById(R.id.buttonCE);
        btnC = findViewById(R.id.buttonC);
        btnNhan = findViewById(R.id.buttonNhan);
        btnChia = findViewById(R.id.buttonChia);
        btnCong = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);
        btnPhay = findViewById(R.id.buttonPhay);
        btnBang = findViewById(R.id.buttonKetQua);

    }

    private void click(String view){
        if(number== null){
            number =view;
        }else {
            number=number+view;
        }
        txtTinh.setText(number);
    }
}