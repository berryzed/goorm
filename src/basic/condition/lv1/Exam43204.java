package basic.condition.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43204 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if (input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}