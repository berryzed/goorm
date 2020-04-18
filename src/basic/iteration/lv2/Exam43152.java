package basic.iteration.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43152 {

    public static boolean isPerfectSquareNumber1(int n) {
        double a = Math.sqrt(n);
        return (int) a == a;
    }

    public static boolean isPerfectSquareNumber2(int n) {
        return n == Math.pow((int) Math.sqrt(n), 2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (isPerfectSquareNumber1(x))
                cnt++;
            // if (isPerfectSquareNumber2(x)) cnt++;
        }
        System.out.println(cnt);
    }
}