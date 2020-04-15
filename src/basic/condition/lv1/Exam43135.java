package basic.condition.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43135 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for (int i = 1; i <= input; i++) {
            System.out.print((i % 3 == 0 ? "X" : i) + " ");
        }
    }
}