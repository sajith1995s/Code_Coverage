package com.example;

public class Calculation {

    public double Simplecal(String operation,double a,double b){
        MathOperation m=new MathOperation();
        double re=2*m.doMath(operation,a,b);

        return re;
    }
}
