package basic.condition.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43111 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(input % 2 == 0 ? "even" : "odd");
    }
}