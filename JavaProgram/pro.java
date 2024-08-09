package JavaProgram;

import java.util.Scanner;

class Pro {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = sc.next();
        System.out.println("hello " + name + ", have a good day");
        sc.close();
    }
}


