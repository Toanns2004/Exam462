package com.example.exam46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mylibrary.Calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {




    TextView txtKetQua, txtTinh;
    Button btnphanTram, btnEC, btnC, btnNhan, btnChia, btnCong, btnTru,btnAS,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0,btnPhay, btnBang;

    boolean dauPhay=false ;

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
                dauPhay =false;
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"-");
                dauPhay =false;
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"*");
                dauPhay =false;
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"/");
                dauPhay =false;
            }
        });




        btnAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtKetQua.getText());
                txtKetQua.setText("");
                dauBangDaduoocAn = false;
            }
        });

        btnEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) txtTinh.getText();
                if(text.length()>=1){
                    txtTinh.setText(txtTinh.getText().subSequence(0,txtTinh.getText().length()-1));
                    dauBangDaduoocAn = false;
                }

            }
        });
        btnPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!dauPhay){
                        txtTinh.setText(txtTinh.getText()+".");
                }
                dauPhay =true;


            }
        });


        btnphanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtTinh.getText()+"%");
                dauPhay =true;
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText("");
                txtKetQua.setText("");
                dauPhay =false;
            }

        });

        btnBang.setOnClickListener(view -> {



                dauBangDaduoocAn= true;
                String txt = (String) txtTinh.getText();

            double kq = Calculation.sketQua(txt);
            if(txt.endsWith("%")){
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



            dauPhay =false;

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

        btnAS = findViewById(R.id.buttonAS);

    }





}


//                if (txt.contains("+")) {
//                    String[] arr = txt.split(Pattern.quote("+"));
//                    for (int i = 0; i < arr.length; i++) {
//
//                        kq += Double.parseDouble(arr[i]);
//
//                    }
//
//
//
//                } else if (txt.contains("-")) {
//
//                        String[] arr = txt.split(Pattern.quote("-"));
//                        double k = Double.parseDouble(arr[0]);
//
//                        for (int i = 1; i < arr.length; i++) {
//                            k -=Double.parseDouble(arr[i]);
//
//                        }
//                        kq = k;
//
//
//                }else if (txt.contains("×")) {
//                    String[] arr = txt.split(Pattern.quote("×"));
//                    double k = Double.parseDouble(arr[0]);
//                    for (int i = 1; i < arr.length; i++) {
//                        k *=Double.parseDouble(arr[i]);
//
//                    }
//                    kq = k;
//                }else if (txt.contains("÷")) {
//                    String[] arr = txt.split("÷");
//                    double k = Double.parseDouble(arr[0]);
//                    for (int i = 1; i < arr.length; i++) {
//                        k /=Double.parseDouble(arr[i]);
//
//                    }
//                    kq = k;

//
