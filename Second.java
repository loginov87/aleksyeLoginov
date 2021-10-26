package Lecture2;

import java.util.Scanner;

public class Second {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Height set:");
        int height = scan.nextInt();

        System.out.println("Count set:");
        int count = scan.nextInt();

        System.out.println("The height building " + height + " m and " + count + " floors");

    }
}