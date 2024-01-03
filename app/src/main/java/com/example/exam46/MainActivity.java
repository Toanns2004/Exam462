package com.example.exam46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mylibrary.Calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {




    TextView txtKetQua;
    TextView txtTinh ;
    Button btnphanTram, btnEC, btnC, btnNhan, btnChia, btnCong, btnTru,btnAS,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0,btnPhay, btnBang;

    boolean dauPhay ;

    boolean dauBangDaduoocAn ;
    boolean dauCong=true;
    boolean dauTru=true;
    boolean dauNhan;
    boolean dauChia;


    boolean dauPhanTram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true || dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;

                }
                txtTinh.setText(txtTinh.getText()+"0");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }

        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"1");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"2");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"3");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"4");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"5");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });



        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"6");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"7");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"9");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dauBangDaduoocAn == true ||dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                txtTinh.setText(txtTinh.getText()+"8");
                dauPhay=false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });


        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dauTru || !dauChia|| !dauNhan) {
                    dauCong=false;
                }
                if(dauBangDaduoocAn == true || dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                if (dauCong){
                    txtTinh.setText(txtTinh.getText()+"+");
                    dauCong=false;
                }


            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dauCong || !dauChia|| !dauNhan) {
                    dauTru=false;
                }
                if(dauBangDaduoocAn == true || dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                if (dauTru){
                    txtTinh.setText(txtTinh.getText()+"-");
                    dauTru = false;
                }
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dauCong || !dauChia|| !dauTru) {
                    dauNhan=false;
                }
                if(dauBangDaduoocAn == true || dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                if (dauNhan){
                    txtTinh.setText(txtTinh.getText()+"*");
                    dauNhan=false;
                }
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dauCong || !dauTru|| !dauNhan) {
                    dauChia=false;
                }
                if(dauBangDaduoocAn == true || dauPhanTram) {
                    txtTinh.setText("");
                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                    dauPhanTram= false;
                }
                if (dauChia){
                    txtTinh.setText(txtTinh.getText()+"/");
                    dauChia=false;
                }

            }
        });




        btnAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText(txtKetQua.getText());
                txtKetQua.setText("");
                dauBangDaduoocAn = false;
                dauCong=true;
                dauTru=true;
                dauNhan= true;
                dauChia=true;
            }
        });

        btnEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) txtTinh.getText();
                if(dauBangDaduoocAn || dauPhanTram){
                    txtKetQua.setText("");
                    txtTinh.setText("");
                    dauPhay =false;
                    dauBangDaduoocAn=false;
                }else if(text.length()>=1){
                    txtTinh.setText(txtTinh.getText().subSequence(0,txtTinh.getText().length()-1));
//                    txtKetQua.setText("");
                    dauBangDaduoocAn = false;
                }
                dauCong=true;
                dauTru= true;

            }
        });
        btnPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tx = (String) txtTinh.getText();
                String end = ".*[+\\-*/]$";
                boolean endsWithOperator = tx.matches(end);
                if (!endsWithOperator){
                    if (!dauPhay){
                        txtTinh.setText(txtTinh.getText()+".");
                    }
                }

                dauPhay=true;
            }
        });


        btnphanTram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dauPhanTram=true;
                String tx = (String) txtTinh.getText();

                String end = ".*[+\\-*/]$";
                boolean endsWithOperator = tx.matches(end);
                if (tx.equals("")){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập phép tính", Toast.LENGTH_SHORT).show();
                }else
                if (endsWithOperator){
                    Toast.makeText(MainActivity.this, "Nhập Sai Dữ Liệu", Toast.LENGTH_SHORT).show();
                }else
                 if(!Pattern.matches(("[+\\-*/]"),tx)){
                    if(tx.startsWith("+") || tx.startsWith("-")){
                        tx = "0"+tx;
                    }
                    String start = "^[*/].*";
                    boolean startsWithOperator = tx.matches(start);
                    if( endsWithOperator || startsWithOperator){
                        Toast.makeText(MainActivity.this, "Không thể thục hiện phép tính", Toast.LENGTH_SHORT).show();

                    } else {
                        float kq = Calculation.sketQua(tx);
                        float kqPT = kq/100;
                        txtKetQua.setText(kqPT+"");
                    }

                } else if (dauBangDaduoocAn) {
                    txtTinh.setText(txtKetQua.getText());
                    String txx = (String) txtTinh.getText();
                    float b = Float.parseFloat(txx);
                    float kqPT = b / 100;
                    txtKetQua.setText(kqPT + "");
                    dauPhay = true;
                } else if (tx.equals("")) {
                    txtKetQua.setText(0 + "");
                } else {
                    float a = Float.parseFloat(tx);
                    float kqPT = a / 100;
                    txtKetQua.setText(kqPT + "");
                    dauPhay = true;

                }

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTinh.setText("");
                txtKetQua.setText("");
                dauPhay =false;
                dauCong=true;
                dauTru= true;
            }

        });

        btnBang.setOnClickListener(view -> {
                dauBangDaduoocAn= true;
                dauChia=false;
                dauNhan=false;
                String txt = (String) txtTinh.getText();

            if (txt.equals("")){
                Toast.makeText(this, "Vui lòng nhập phép tính", Toast.LENGTH_SHORT).show();
            }else if(txt.startsWith("+") || txt.startsWith("-")){
                txt = "0"+txt;
            }
            String start = "^[*/].*";
            boolean startsWithOperator = txt.matches(start);

            String end = ".*[+\\-*/]$";
            boolean endsWithOperator = txt.matches(end);
            if( endsWithOperator || startsWithOperator){
                Toast.makeText(this, "Không thể thục hiện phép tính", Toast.LENGTH_SHORT).show();

            } else {
                float kq = Calculation.sketQua(txt);
                if (kq==Math.round(kq)){
                    int rs = (int) kq;
                    txtKetQua.setText(rs+"");
                }else {
                    txtKetQua.setText(kq+"");
                }
            }

            dauPhay =true;

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



    private void tinh(String txt){
        if (txt.equals("")){
            Toast.makeText(this, "Vui lòng nhập phép tính", Toast.LENGTH_SHORT).show();
        }

        if(txt.startsWith("+") || txt.startsWith("-")){
            txt = "0"+txt;
        }
        String start = "^[*/].*";
        boolean startsWithOperator = txt.matches(start);

        String end = ".*[+\\-*/]$";
        boolean endsWithOperator = txt.matches(end);
        if( endsWithOperator || startsWithOperator){
            Toast.makeText(this, "Không thể thục hiện phép tính", Toast.LENGTH_SHORT).show();

        } else {
            float kq = Calculation.sketQua(txt);
            if (kq==Math.round(kq)){
                int rs = (int) kq;
                 txtKetQua.setText(rs+"");
            }else {
                 txtKetQua.setText(kq+"");
            }
        }

    }
}



