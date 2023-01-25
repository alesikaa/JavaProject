package JavaProject;

public class Task3 {
    public static void main(String[] args) {
        /*Create a 2D array of integer values. Print the sum of all numbers*/
        int[][] arr={{10,20,30},{100,200,300},{40,50,60},{400,500,600}};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all numbers is "+sum);
    }
}


