package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        double highestNumber = 0;
        for (int i = 1; i >= 1; i++) {
            System.out.print("Number " + i + ": ");
            double number = scanner.nextDouble();
            if (number > highestNumber) {
                highestNumber = number;
            }
            if (number <= 0 && i == 1) {
                System.out.println("No number entered.");
                break;
            }
            if (number <= 0) {
                System.out.printf("The largest number is %.2f", highestNumber); // print f um das Format anzugeben
                break;
            }
        }


    //todo Task 2
    public void stairs(){
        // input your solution here
        int Line = 1, size;
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        size = scan.nextInt();

        if (0 >= size){
            System.out.println("Invalid number!");
        } else {
            for (int Number = 1; Number <= size; Number++) {
                for (int Number = 0; Number < Line; Number++) {
                    System.out.print(Line++ + " ");
                }
                System.out.println();
            }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        if (h % 2 == 0){
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }
        for(int i = 1; i < h / 2 + 2; i++){
            for(int j = 0; j < h / 2 - i + 1; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                char aug = (char) (c + 1 - k);
                System.out.print(aug);
            }
            for (int l = 2; l <= i; l++){
                char aug2 = (char) (c + 1 - l);
                System.out.print(aug2);
            }
            System.out.println();
        }

        for(int i = 0; i < h / 2; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = i; k <= h / 2 - 1; k++) {
                char aug = (char) ((c-h/2+1)+k);
                System.out.print(aug);
            }
            for (int k = i; k <= h/2-2; k++){
                char aug2 = (char) (c-1-k);
                System.out.print(aug2);
            }
            System.out.println();
        }

    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner t5 = new Scanner(System.in);
        int num = 1;
        double m = 1;
        double s = 0;
        double a;
        int cM = 0;
        int cNM = 0;


        while (m > 0) {
            System.out.print("Mark " + num + ": ");
            num++;

            m = t5.nextInt();

            if ((num == 2) && (m == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");

            } else if ((m > 5) && (m != 0)) {
                System.out.println("Invalid mark!");
                num--;

            } else if ((m > 0) && (m < 6)) {
                s = s + m;
                cM++;

                if (m == 5) {
                    cNM++;
                }

            } else if (m == 0) {
                a = s / (cM);
                System.out.println("Average: " + String.format("%.2f", a));
                System.out.println("Negative marks: " + cNM);
            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();
        int s2;
        int d1;
        int d2;
        int d3;

        while (number > 0) {
            if (number != 1 && number != 4) {
                d3 = number % 10;
                d2 = (number / 10) % 10;
                d1 = (number / 100) % 10;
                s2 = (int) (Math.pow(d1, 2) + Math.pow(d2, 2) + Math.pow(d3, 2));
                number = s2; }

            else if (number == 1) {

                System.out.println("Happy number!");
                break;
            }
            else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }

        }

    public static void main(String[] args)
        {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}