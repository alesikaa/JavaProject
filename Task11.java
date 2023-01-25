package JavaProject;
import java.util.Arrays;
public class Task11 {
    public static void main(String[] args) {

        int[] numbers = {11, 57, 2, 13, 5, 13, 57, 8, 11};
        System.out.println("Duplicate elements are:");

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){

                if (numbers[i]==numbers[j]){

                    System.out.println(numbers[j]);
                }
            }
        }
    }
}

