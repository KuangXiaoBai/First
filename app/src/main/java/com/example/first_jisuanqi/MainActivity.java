package com.example.first_jisuanqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //声明组件（包括数字0-9和运算符号）
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_c,btn_del,btn_gen,btn_div,btn_mul,btn_sub,btn_sum,btn_sgn,btn_point,btn_equ;
    private TextView cal_result; /*窗口一结果显示   结果集*/
    private TextView Textview;  /*窗口二记录输入数字和符号   表达式集*/
    private boolean isClickequ=false;//清空标识
    private boolean flag = true; //负数标识
    private String strnum1,strnum2="";  /*运算使用的中间值*/
    private double num1,num2=0.0; /*运算值变量*/
    private String op = ""; /*存放运算符号*/
    private double result = 0.0; /*存放运算结果*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); //当前Activity的布局文件设置为activity_main.xml

        /*将布局文件中的各个组件与代码中的变量进行绑定*/
        cal_result=findViewById(R.id.result);
        Textview = findViewById(R.id.testview);
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_c=findViewById(R.id.btn_c);
        btn_del=findViewById(R.id.btn_del);
        btn_gen=findViewById(R.id.btn_gen);
        btn_div=findViewById(R.id.btn_div);
        btn_mul=findViewById(R.id.btn_mul);
        btn_sub=findViewById(R.id.btn_sub);
        btn_sum=findViewById(R.id.btn_sum);
        btn_sgn=findViewById(R.id.btn_sgn);
        btn_point=findViewById(R.id.btn_point);
        btn_equ=findViewById(R.id.btn_equ);

        /*监听器*/
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_gen.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sgn.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_equ.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        /*数字1-9*/
        if (view.getId() == R.id.btn_0) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "0");
            Textview.setText(Textview.getText()+"0");
        } else if (view.getId() == R.id.btn_1) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "1");
            Textview.setText(Textview.getText()+"1");
        } else if (view.getId() == R.id.btn_2) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "2");
            Textview.setText(Textview.getText()+"2");
        } else if (view.getId() == R.id.btn_3) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "3");
            Textview.setText(Textview.getText()+"3");
        } else if (view.getId() == R.id.btn_4) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "4");
            Textview.setText(Textview.getText()+"4");
        } else if (view.getId() == R.id.btn_5) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "5");
            Textview.setText(Textview.getText()+"5");
        } else if (view.getId() == R.id.btn_6) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "6");
            Textview.setText(Textview.getText()+"6");
        } else if (view.getId() == R.id.btn_7) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "7");
            Textview.setText(Textview.getText()+"7");
        } else if (view.getId() == R.id.btn_8) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "8");
            Textview.setText(Textview.getText()+"8");
        } else if (view.getId() == R.id.btn_9) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "9");
            Textview.setText(Textview.getText()+"9");
        } else if (view.getId() == R.id.btn_c) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
                flag = true;
            }
            cal_result.setText("");
            Textview.setText("");
        }
        /*小数点的实现*/
        else if (view.getId() == R.id.btn_point) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + ".");
            Textview.setText(Textview.getText()+".");
        }
        /*提供一个按钮切换正负数功能实现*/
        else if (view.getId() == R.id.btn_sgn) {
            strnum1 = cal_result.getText().toString();
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            result = 0 - num1;
            /*op = "+/-";*/
            Textview.setText(Textview.getText()+"+/-");

            cal_result.setText(result + "");
            Textview.setText(result+"");
            isClickequ = true;
            flag = true;

        }
        /*加法的实现*/
        else if (view.getId() == R.id.btn_sum) {
            strnum1 = cal_result.getText().toString();
            /*if (strnum1.equals("")) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }*/
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "+";
            Textview.setText(Textview.getText()+"+");
            isClickequ = false;
        } else if (view.getId() == R.id.btn_sum) {
            strnum1 = cal_result.getText().toString();

            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "+";
            Textview.setText(Textview.getText()+"+");
            isClickequ = false;
        }
        /*减法的实现*/
        else if (view.getId() == R.id.btn_sub) {

            if (flag) {
                cal_result.setText(cal_result.getText() + "-");
                Textview.setText(Textview.getText()+"-");
                num1 = 0.0;
                flag = false;
                isClickequ = false;
            }
            else {
                strnum1 = cal_result.getText().toString();
                Textview.setText(Textview.getText()+"-");
                num1 = Double.parseDouble(strnum1);
                cal_result.setText("");
                op = "-";
                isClickequ = false;
            }
        }
        /*乘法的实现*/
        else if (view.getId() == R.id.btn_mul) {
            strnum1 = cal_result.getText().toString();
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "x";
            Textview.setText(Textview.getText()+"x");
            isClickequ = false;
        }
        /*除法的实现*/
        else if (view.getId() == R.id.btn_div) {
            strnum1 = cal_result.getText().toString();
            /*if (strnum1.equals("")) {
                *//*Textview.setText(Textview.getText()+"÷");*//*
                Toast.makeText(getApplicationContext(), "error：运算符前没有数", Toast.LENGTH_SHORT).show();
                cal_result.setText("error");
                Textview.setText("error");

            }*/
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "÷";
            Textview.setText(Textview.getText()+"÷");
            isClickequ = false;
        }
        /*求根*/
        else if (view.getId() == R.id.btn_gen) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText() + "√");
            op = "√";
            Textview.setText(Textview.getText()+"√");
            cal_result.setText("");
            isClickequ = false;
        }
        /*输入等于号后运算结果处理*/
        else if (view.getId() == R.id.btn_equ) {
            strnum2 = cal_result.getText().toString();

            num2 = Double.parseDouble(strnum2);
            cal_result.setText("");
            switch (op) {
                case "+":
                    result = num1 + num2;
                    cal_result.setText(result + "");
                    Textview.setText(result+"");
                    break;
                case "-":
                    result = num1 - num2;
                    cal_result.setText(result + "");
                    Textview.setText(result+"");
                    break;
                case "x":
                    result = num1 * num2;
                    cal_result.setText(result + "");
                    Textview.setText(result+"");
                    break;
                case "÷":
                    if (num2 == 0) {
                        Toast.makeText(getApplicationContext(), "分母不能为0", Toast.LENGTH_SHORT).show();
                        cal_result.setText("error");
                        Textview.setText("error");
                        break;
                    }
                    result = num1 / num2;
                    cal_result.setText(result + "");
                    Textview.setText(result+"");
                    break;
                case "√" :
                    if(num2<0){

                        Toast.makeText(getApplicationContext(), "错误，负数不能开方", Toast.LENGTH_SHORT).show();
                        cal_result.setText("error");
                        Textview.setText("error");
                        break;
                    }
                    result = Math.sqrt(num2);
                    cal_result.setText(result + "");
                    Textview.setText(result+"");
                    break;
                /*case "+/-" :
                    result = 0 - num1;
                    break;*/
                default:
                    /*result = 0.0;*/
                    cal_result.setText("error");
                    Textview.setText("error");
                    break;

            }
            op = "";
            isClickequ = true;

        }


    }
}

