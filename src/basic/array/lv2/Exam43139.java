package basic.array.lv2;

public class Exam43139 {
    
    public static void main(String[] args) throws Exception {
        int [][][] arr3d = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int k = 0; k < arr3d[i][j].length; k++) {
                    System.out.print(arr3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}