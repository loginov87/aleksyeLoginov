package Lecture2;

import java.util.Scanner;

public class Task4 {

        public static void main(String[] args) {

            System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
            //Scanner scan = new Scanner(System.in);
            //System.out.println("Answer:");
            //String answer = scan.nextLine();
            String option1 = "Fire";
            String option2 = "I don't know";
            int i = 1;
            while (i < 4) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Your answer:");
                String answer = scan.nextLine();

                if (answer.equals(option1)) {
                    System.out.println("Great");
                    break;

                }
                if ((answer.equals(option2))) {
                    System.out.println("Answer: Fire");
                    break;

                } else {
                    System.out.println("Think again");
                    i++;

                }
            }

        }
    }

