package com.OOP;

import java.util.Scanner;

public class forFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(3*j + " ");
            }
            System.out.println(" ");

/*
3
6 9
12 15 18
 */

        }}
}
