package com.example.calculatorv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    String numbers="";
    //when the user hits any operation the first string will be saved here like
    //string = 123 then + so 123 will be saved in temp and stringNumber will be equal the next value
    String tempNumbers="";
    char[] decimal=new char[20];
    char[] beforeDot=new char[20];
    int index;
    TextView txtField;
    TextView txtFieldPrvious;
    TextView txtFieldOp;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button equal;
    Button dot;
    Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtField=findViewById(R.id.textViewMain);
        txtFieldPrvious=findViewById(R.id.textViewPrvious);
        txtFieldOp=findViewById(R.id.textViewOperation);

        //number 0-9
        one =  findViewById(R.id.button1);
        one.setOnClickListener(this); // calling onClick() method
        two = findViewById(R.id.button2);
        two.setOnClickListener(this);
        three =  findViewById(R.id.button3);
        three.setOnClickListener(this);
        four =  findViewById(R.id.button4);
        four.setOnClickListener(this); // calling onClick() method
        five =findViewById(R.id.button5);
        five.setOnClickListener(this);
        six = findViewById(R.id.button6);
        six.setOnClickListener(this);
        seven =  findViewById(R.id.button7);
        seven.setOnClickListener(this); // calling onClick() method
        eight = findViewById(R.id.button8);
        eight.setOnClickListener(this);
        nine =  findViewById(R.id.button9);
        nine.setOnClickListener(this);
        zero = findViewById(R.id.button0);
        zero.setOnClickListener(this); // calling onClick() method
        equal = findViewById(R.id.buttonEqual);
        equal.setOnClickListener(this); // calling onClick() method
        dot = findViewById(R.id.buttonDot);
        dot.setOnClickListener(this); // calling onClick() method
        clear = findViewById(R.id.buttonC);
        clear.setOnClickListener(this); // calling onClick() method
        //operations  + - x /
        Button plus = (Button) findViewById(R.id.buttonPlus);
        plus.setOnClickListener(this); // calling onClick() method
        Button minus = (Button) findViewById(R.id.buttonMinus);
        minus.setOnClickListener(this);
        Button multiply = (Button) findViewById(R.id.buttonMultiply);
        multiply.setOnClickListener(this);
        Button divide = (Button) findViewById(R.id.buttonDivide);
        divide.setOnClickListener(this); // calling onClick() method
    }
    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.button1:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "1";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button2:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "2";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button3:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "3";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button4:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "4";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button5:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "5";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button6:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "6";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button7:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "7";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button8:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "8";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button9:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += "9";
                    txtField.setText(numbers.toString());
                }
                else maxSize();
                break;

            case R.id.button0:
                if(checkSize(numbers)) {        //true if size < or = 10

                    if (numbers.equals("0")) {
                        Toast.makeText(getApplicationContext(), "0 can't be the written many times om the left", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        numbers += "0";
                        txtField.setText(numbers.toString());
                    }
                    /*else
                    {
                        numbers += "1";
                        txtField.setText(numbers.toString());
                    }*/

                }
                else maxSize();
                break;



             //decimal (dot)
            case R.id.buttonDot:
                if(checkSize(numbers)) {        //true if size < or = 10
                    numbers += ".";
                    txtField.setText(numbers.toString());
                }

                break;




            //clear
            case R.id.buttonC:
                numbers="";
                tempNumbers="";
                txtFieldPrvious.setText(tempNumbers.toString());
                txtField.setText(numbers.toString());
                txtFieldOp.setText("");
                break;





            //operations
            case R.id.buttonPlus:
                txtFieldPrvious.setText(numbers);
                tempNumbers=numbers;
                txtFieldOp.setText("+");
                //Toast.makeText(getApplicationContext(),"enter the second number",Toast.LENGTH_SHORT).show();
                numbers="";
                txtField.setText(numbers.toString());
                break;
            case R.id.buttonMinus:
                txtFieldPrvious.setText(numbers);
                tempNumbers=numbers;
                txtFieldOp.setText("-");
                //Toast.makeText(getApplicationContext(),"enter the second number",Toast.LENGTH_SHORT).show();
                numbers="";
                txtField.setText(numbers.toString());
                break;
            case R.id.buttonMultiply:
                txtFieldPrvious.setText(numbers);
                tempNumbers=numbers;
                txtFieldOp.setText("X");
                //Toast.makeText(getApplicationContext(),"enter the second number",Toast.LENGTH_SHORT).show();
                numbers="";
                txtField.setText(numbers.toString());
                break;
            case R.id.buttonDivide:
                txtFieldPrvious.setText(numbers);
                tempNumbers=numbers;
                txtFieldOp.setText("/");
                //Toast.makeText(getApplicationContext(),"enter the second number",Toast.LENGTH_SHORT).show();
                numbers="";
                txtField.setText(numbers.toString());
                break;


            //equal button
            case R.id.buttonEqual:
                String operation=txtFieldOp.getText().toString();
                double outputValue=0;
                String output;
                if(numbers==""&&tempNumbers=="")
                    Toast.makeText(getApplicationContext(),"please enter a value",Toast.LENGTH_SHORT).show();
                else if(tempNumbers=="")
                {
                    outputValue=Double.parseDouble(numbers);
                    numbers="";
                    txtFieldPrvious.setText(tempNumbers);
                    txtField.setText(numbers);

                }
                else if(numbers=="")
                {
                    System.out.println("no");
                    numbers="";
                    txtFieldPrvious.setText("");
                    txtField.setText(numbers);
                    Toast.makeText(getApplicationContext(),"please enter the 2 values",Toast.LENGTH_SHORT).show();

                }
                else if(operation=="+") {
                    outputValue=Double.parseDouble(numbers)+Double.parseDouble(tempNumbers);
                    txtField.setText((outputValue)+"");
                }
                else if(operation=="-")
                {
                    outputValue=Double.parseDouble(tempNumbers)-Double.parseDouble(numbers);
                    txtField.setText((outputValue)+"");
                }
                else if(operation=="X")
                {
                    outputValue=Double.parseDouble(numbers)*Double.parseDouble(tempNumbers);
                    txtField.setText((outputValue)+"");
                }
                else if(operation=="/") {
                    if (Integer.parseInt(numbers) != 0 && Double.parseDouble(numbers)!=0.0) {
                        outputValue = Double.parseDouble(tempNumbers) /  Double.parseDouble(numbers);
                        txtField.setText((outputValue) + "");
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"cant divide by 0!!",Toast.LENGTH_LONG).show();
                        tempNumbers="";
                        numbers="";
                    }
                }
                //if the user hit equal and he just entered 1 value


                else {
                    //outputValue = Double.parseDouble(numbers);

                    Toast.makeText(getApplicationContext(),"please enter a value",Toast.LENGTH_SHORT).show();
                    numbers = "";
                    txtFieldPrvious.setText("");
                    txtField.setText("");
                }
                output=outputValue+"";
                numbers="";
                tempNumbers="";

                if(output.contains("."))
                     index=output.indexOf(".");
                int indexForBefore=index;
                //System.out.println("hallo "+output);
                int i=0;
                //System.out.println(index);
                while(i<index) {
                    beforeDot[i] = output.charAt(i);
                    i++;
                }

                /*for (int j=0;j<index;j++)
                    System.out.println("before "+beforeDot[j]);*/
                i=0;
                while(index<output.length()) {
                    decimal[i] = output.charAt(index);
                    i++;
                    index++;
                }
                output="";
                i=0;
                while(i<indexForBefore) {
                    output += beforeDot[i];
                    i++;
                }
                i=0;
                while(i<=4 &&i<decimal.length) {
                    output += decimal[i];
                    i++;
                }
                txtFieldPrvious.setText(tempNumbers.toString());
                txtField.setText(output);
                txtFieldOp.setText("");
                break;
            default:
                break;
        }
    }
    boolean checkSize(String a)
    {
        if(a.length()<=9)
            return true;
        return false;
    }
    void maxSize()
    {
        Toast.makeText(getApplicationContext(),"you reach the  maximum size",Toast.LENGTH_SHORT).show();
    }
}