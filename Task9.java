package JavaProject;
import java.util.Arrays;
public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}

