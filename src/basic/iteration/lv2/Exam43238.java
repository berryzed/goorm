package basic.iteration.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43238 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean isPrime = true;
        for (int i = 2; i <= 3; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "True" : "False");
    }
}