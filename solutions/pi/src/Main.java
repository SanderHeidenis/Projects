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
            String result = "";
            String pi = "";
            pi += PI;

            result += pi.substring(0, (N));

            float addition = Float.parseFloat(pi.substring(N, N + 2));
            result += Math.round(addition / 10);
            System.out.println(result);
        }
    }


}
