package basic.function.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam43190 {

    public static double calc(int principal, double rate, int term) {
        double totalPrincipal = principal;
        for (int i = 0; i < term; i++) {
            totalPrincipal += totalPrincipal * (rate / 100);
        }
        return totalPrincipal;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 원금
        double b = Double.parseDouble(st.nextToken()); // 이자율
        int c = Integer.parseInt(st.nextToken()); // 기간

        // System.out.println(String.format("%.2f", calc(a, b, c)));
        System.out.println(String.format("%.2f", a * Math.pow(1 + (b / 100), c)));
    }
}