package JavaProject;
import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        /*2)Using Scanner create an array of countries. When an array is created,
     retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).*/

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter countries Name");
            String[] arr = new String[4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextLine();
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i].toLowerCase()) {
                    case "england":
                        System.out.println("England Capital: " + "London");
                        break;
                    case "italy":
                        System.out.println("Italy Capital: " + "Roma");
                        break;
                    case "moldova":
                        System.out.println("Moldova Capital: " + "Chisinau");
                        break;
                    case "russia":
                        System.out.println("Russia Capital: " + "Moscow");
                        break;
                    default:
                        System.out.println("Wrong country");
                }
            }

        }
    }


