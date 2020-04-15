package basic.array.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43196 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + (n * j) + " ");
            }
            System.out.println();
        }
    }
}