package pi;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many digits of pi do you want? (max 15)");
        int N = scanner.nextInt();
        if (N > 15) {
            System.out.println("too many digits");
        } else {
            String result = "", pi = "";
            pi += PI;

            result += pi.substring(0, (N));

            result += Math.round(Float.parseFloat(pi.substring(N, N + 2)) / 10);
            System.out.println(result);
        }
    }


}
//here
// 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 == Pi / 4