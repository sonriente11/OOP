package com.OOP;

import java.util.Scanner;

public class forFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
                }
            System.out.println(" ");

/*
1
1 2
1 2 3
1 2 3 4
 */

        }
    }
}
