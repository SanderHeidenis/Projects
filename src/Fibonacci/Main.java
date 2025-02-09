package Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int fib(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many digits of the Fibonacci sequence?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
