import java.util.Arrays;

public class TD2dArrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4]; // 3 rows and 4 colums
        System.out.println("kunal " + Arrays.toString(grades[0]));
        System.out.println("Mansi " + Arrays.toString(grades[1]));
        System.out.println("Sujal " + Arrays.toString(grades[2]));

        String s="kunal Supekar";
        s="abhi";
        System.out.println(s);

        int[][] marks = { { 2, 3, 2 },
                { 3, 4, 3, 2 },
                { 4, 2, 1, 2,5,4,2,4 } };

                System.out.println("kunal " + Arrays.toString(marks[0]));
        System.out.println("Mansi " + Arrays.toString(marks[0]));
        System.out.println("Sujal " + Arrays.toString(marks[2]));
        System.out.println(marks[2].length);


        String[][] table = new String[3][3]; 
        System.out.println((Arrays.toString(table[0])));

    }
}
