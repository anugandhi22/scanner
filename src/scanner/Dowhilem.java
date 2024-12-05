package scanner;

import java.util.Scanner;

public class Dowhilem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 0 or 1 to input student's marks:");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter student's marks:");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks.");
                }
            } 
        } while (n!=0);
        System.out.println("No marks ");
    }
}

