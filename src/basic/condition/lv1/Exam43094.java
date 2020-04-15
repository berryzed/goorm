package basic.condition.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam43094 {

    public static char getGrade(double avg) {
        if (avg > 90) {
            return 'A';
        } else if (avg > 80) {
            return 'B';
        } else if (avg > 70) {
            return 'C';
        } else if (avg > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static double getAvg1(int[] score) {
        double total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total / score.length;
    }

    public static double getAvg2(int[] score) {
        return Arrays.stream(score).average().orElse(0);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] score = new int[3];
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        double avg = getAvg1(score);
        // double avg = getAvg2(score);
        System.out.println(String.format("%.2f %c", avg, getGrade(avg)));
    }
}