package com.example.exam46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView txtKetQua, txtTinh;
    Button btnphanTram, btnEC, btnC, btnNhan, btnChia, btnCong, btnTru,btnDel,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0,btnPhay, btnBang;
    double kq =0;

    boolean dau = false;

    boolean dauBangDaduoocAn ;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"5");
            }
        });



        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"7");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"9");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                txtTinh.setText(txtTinh.getText()+"8");
            }
        });


        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"+");
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"-");
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"×");
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"÷");
            }
        });




        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) txtTinh.getText();
                if(text.length()>=1){
                    txtTinh.setText(txtTinh.getText().subSequence(0,txtTinh.getText().length()-1));

                }
            }
        });

        btnPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dau){
                    txtTinh.setText(txtTinh.getText()+",");
                }

                dau = true;
            }
        });


        btnphanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"%");

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText("");
                txtKetQua.setText("");
            }
        });

        btnBang.setOnClickListener(view -> {

                dauBangDaduoocAn= true;
                String txt = (String) txtTinh.getText();
                if (txt.contains("+")){
                    String[] arr = txt.split(Pattern.quote("+"));
                    kq = Double.parseDouble(arr[0]) + Double.parseDouble(arr[1]);
                } else if (txt.contains("-")) {
                    String[] arr = txt.split(Pattern.quote("-"));
                    kq = Double.parseDouble(arr[0]) - Double.parseDouble(arr[1]);
                }else if (txt.contains("×")) {
                    String[] arr = txt.split(Pattern.quote("×"));
                    kq = Double.parseDouble(arr[0]) * Double.parseDouble(arr[1]);
                }else if (txt.contains("÷")) {
                    String[] arr = txt.split("÷");
                    kq = Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]);
                }else if(txt.endsWith("%")){
                    String[] arr = txt.split("%");
                    double a= Double.parseDouble(arr[0]);
                    kq=a/100;
                }

                if (kq==Math.round(kq)){
                    int rs = (int) kq;
                    txtKetQua.setText(rs+"");
                }else {
                    txtKetQua.setText(kq+"");
                }




        });




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

        btnDel = findViewById(R.id.buttonDelete);

    }




}