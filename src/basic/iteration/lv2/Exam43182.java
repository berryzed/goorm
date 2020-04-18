package basic.iteration.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43182 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%d * %d = %d ", i, j, i * j));
                if (j % n == 0)
                    System.out.println();
            }
        }
    }
}