package JavaProject;

public class Task10 {
    public static void main(String[] args) {
//Write a java program to find the second largest number in the array
        int LargestNumber = 0;
        int SecondLargest = 0;

        int[] numbers = {3, 9, 12, 15, 18, 21};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > LargestNumber) {
                SecondLargest = LargestNumber;
                LargestNumber = numbers[i];

            } else if (numbers[i] > SecondLargest) {
                SecondLargest = numbers[i];
            }
        }
        System.out.println("The 2nd Highest Number is "+SecondLargest);
    }
    }

