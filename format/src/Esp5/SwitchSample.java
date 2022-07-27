package Esp5;

import java.util.Scanner;

public class SwitchSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input;
        System.out.println("input numbers ranging from 1-12 for each moth of the year");
        input  = sc.nextInt();

        switch(input){
            case 1:
            System.out.println("welcome to jan, it has 31days");
            break;
            case 2:
            System.out.println("welcome to feb, it has 28days");
            break;
            case 3:
            System.out.println("welcome to march, it has 22days");
            break;
            case 4:
            System.out.println("welcome to april, it has 31days");
            break;
            case 5:
            System.out.println("welcome to may, it has 30days");
            break;
            case 6:
            System.out.println("welcome to june, it has 31days");
            break;
            case 7:
            System.out.println("welcome to july, it has 28days");
            break;
            case 8:
            System.out.println("welcome to aug, it has 30days");
            break;
            case 9:
            System.out.println("welcome to sep, it has 31days");
            break;
            case 10:
            System.out.println("welcome to oct, it has 28days");
            break;
            case 11:
            System.out.println("welcome to nov, it has 30days");
            break;
            case 12:
            System.out.println("welcome to dec, it has 31days");
            break;
        }


    }
}
