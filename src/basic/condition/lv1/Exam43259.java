package basic.condition.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam43259 {

    public static String solution1(String input) {
        return input.replace(" ", "");
    }

    public static String solution2(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String solution3(String input) {
        return input.chars().filter(c -> c != ' ').collect(
            StringBuilder::new, 
            StringBuilder::appendCodePoint, 
            StringBuilder::append).toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // System.out.println(solution1(input));
        System.out.println(solution2(input));
        // System.out.println(solution3(input));
    }
}