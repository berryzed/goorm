package basic.array.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.StringTokenizer;

public class Exam43125 {

    public static int solution1(int[] arr) {
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        return stat.getMin();
    }

    public static int solution2(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }
}