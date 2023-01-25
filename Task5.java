package JavaProject;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a  2D array of integers.
        Develop a program which will calculate the sum of  even and odd numbers for that array
         */
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenSum += array[i][j];
                } else {
                    oddSum += array[i][j];
                }
            }
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }
    }

