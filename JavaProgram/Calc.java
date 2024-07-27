package JavaProgram;

import java.util.Scanner;

public class Calc {
    public double calculator(int num1, int num2, char operator) {
        double result = 0;
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = (double)num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
        return result;
    }

    }
    class Advcall extends Calc{
        Scanner scanner;
        public Advcall(){
            scanner = new Scanner(System.in);
        }
        public double power(double base, int exponent){
            double result = 1;
            for(int i = 0; i < exponent; i++){
                result *= base;
            }
            return result;
        }

    }

    class Deepika{
    public static void main(String[] args){
        Advcall adv = new Advcall();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result = adv.calculator(num1, num2, operator);
        System.out.println("Result: " + result);
        result = adv.power(num1,num2);
        System.out.println("Result Power: " + result);
    }
    }
