package JavaProject;

public class Task4 {
    public static void main(String[] args) {
           /*Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.*/
        int[][] array = {{11,12,13,14},{15,16,17,18},{19,20,21,22}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
    }

