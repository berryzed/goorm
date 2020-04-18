package basic.iteration.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43232 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        System.out.println(sum);
    }
}