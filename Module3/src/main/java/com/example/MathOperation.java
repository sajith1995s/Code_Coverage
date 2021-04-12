package com.example;

public class MathOperation {
    public double  doMath(String mathoperation, double number1, double number2) {

        switch (mathoperation)
        {
            case "1":
                return (number1 + number2);

            case "2":
                return  (number1 - number2);

            case "3":
                return (number1 / number2);

            case "4":
                return (number1 * number2);

            default:
                throw new IllegalStateException("mathoperation is not valid");
        }
    }

}
