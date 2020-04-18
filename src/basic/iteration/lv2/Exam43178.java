package basic.iteration.lv2;

public class Exam43178 {

    public static void main(String[] args) throws Exception {
        String text = "";
        for (int i = 1; i <= 5; i++) {
            text += i;
            System.out.println(String.format("%08d", Integer.parseInt(text)));
        }
    }
}