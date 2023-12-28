package com.example.mylibrary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation {
    public static void main(String[] args) {

        String a = "9.5*2+8/5+4*2+8/2+";
        List<String > b = new ArrayList<>();
        StringBuilder _sb = new StringBuilder("Sam");
        String _s = "Jam";

        _sb.insert(0, "Hello ");

        System.out.println(_sb);
//        String a = "19-4";

//        Pattern pattern = Pattern.compile("[+\\-*/].*$");
//        Matcher matcher = pattern.matcher(a);
//
//        if (matcher.matches()) {
//            System.out.println("Sai");
//        } else {
//            System.out.println("Đúng");
//        }

//        String start = "^[+\\-*/].*";
//        boolean startsWithOperator = a.matches(start);
//        String end = ".*[+\\-*/]$";
//        boolean endsWithOperator = a.matches(end);
//        if(startsWithOperator || endsWithOperator){
//            System.out.println("ĐÚNG");
//        } else {
//            System.out.println("SAI");
//        }

//        List<String> s = tacSo(a);
//        List<String> dau = tachChuoi(a);
////
////        Calculation.nhanChia(dau,s);
//        Calculation.congTru(dau,s);
//
////        Calculation.congTru(dau,s);
//        for (String d: s){
//            System.out.println(d);
//        }
//
//        for (String b: dau){
//            System.out.println(b);
//        }

//        double kq= Calculation.sketQua(a);
//        System.out.println(kq);
//        if (kq==Math.round(kq)){
//            int rs = (int) kq;
//            System.out.println(rs);
//        }else {
//            System.out.println(kq);
//        }
    }

    public static float sketQua(String input){

        float a = 0;
        List<String> so = Calculation.tacSo(input);
        List<String> dau =Calculation.tachChuoi(input);

        Calculation.nhanChia(dau,so);
        Calculation.congTru(dau,so);

        a = Float.parseFloat(String.valueOf(so.get(0)));
        return a;
    }


    public static void congTru(List<String> dau, List<String> so){


        for (int i = 0; i < dau.size(); i++) {
            if (dau.get(i).equals("+") || dau.get(i).equals("-") ){
                List<String> arrSo = new ArrayList<>();
                List<String> arrDau =  new ArrayList<>();
                double number=0;
                if (dau.get(i).equals("+")){
                    number= Double.parseDouble(so.get(i))+Double.parseDouble(so.get(i+1));
                }else {
                    number= Double.parseDouble(so.get(i))-Double.parseDouble(so.get(i+1));
                }


                for (int j = 0; j < so.size()-1; j++) {
                    if (j<i){
                        arrSo.add(String.valueOf(so.get(j)));
                    } else if (j==i) {
                        arrSo.add(String.valueOf(number));
                    }else {
                        arrSo.add(String.valueOf(Double.parseDouble(String.valueOf(so.get(j+1)))));
                    }

                }
//                so= arrSo;
                so.clear();
                so.addAll(arrSo);
                for (int j = 0; j < dau.size()-1; j++) {
                    if(j<i){
                        arrDau.add(String.valueOf(dau.get(j)));
                    }else {
                        arrDau.add(String.valueOf(dau.get(j+1)));
                    }
                }
                dau.clear();
                dau.addAll(arrDau);

                i--;
            }

        }
//        for (String s: so){
//            System.out.println(s);
//        }
//
//        for (String d: dau){
//            System.out.println(d);
//        }
    }

    public static void nhanChia(List<String> dau, List<String> so){


        for (int i = 0; i < dau.size(); i++) {

            if ( dau.get(i).equals("/") || dau.get(i).equals("*")) {
                List<String> newArr = new ArrayList<>();
                List<String> arrDau =  new ArrayList<>();
                double newNumber=0;
                if(dau.get(i).equals("*")){
                    newNumber= Double.parseDouble(so.get(i))*Double.parseDouble(so.get(i+1));
                }else {
                      newNumber= Double.parseDouble(so.get(i))/Double.parseDouble(so.get(i+1));
                }

                for(int j = 0; j < so.size() - 1; j++) {
                    if(j == i) {

                        newArr.add(String.valueOf(newNumber));
                    } else if(j < i) {
                        newArr.add(String.valueOf(Double.parseDouble(so.get(j))));
                    } else {
                        newArr.add(String.valueOf(Double.parseDouble(so.get(j + 1))));
                    }
                }
                so.clear();
                so.addAll(newArr);
                for (int j = 0; j < dau.size() - 1; j++) {
                    if (j<i){
                        arrDau.add(dau.get(j));
                    } else {
                        arrDau.add(dau.get(j + 1));
                    }
                }

                dau.clear();
                dau.addAll(arrDau);
                i--;
            }
        }
//        for (String s: so){
//            System.out.println(s);
//        }
//
//        for (String d: dau){
//            System.out.println(d);
//        }
//
//        System.out.println("nnnnnnnnnnnnnnnnnnn");
    }


    public static  List<String>  tachChuoi(String a){
        //how to check char is number in Java
        String [] arr = a.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/") ){
                list.add(arr[i]);
            }
        }
//        String[] arrDau = new String[list.size()];
//        arrDau = list.toArray(arrDau);
        return list;
    }

    public static List<String> tacSo(String c){

        Pattern pattern = Pattern.compile("\\b\\d+(\\.\\d+)?\\b");
        Matcher m = pattern.matcher(c);

        List<String> list = new ArrayList<>();
        while (m.find()){
            list.add(m.group());
        }

//        String[] arrSo = new String[list.size()];
//        arrSo = list.toArray(arrSo);

        return list;
    }


}