package JavaProject;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
       // Write a java program to check whether a given number is prime or not?
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNumber=input.nextInt();
        boolean isPrime=true;
        int t;
        input.close();
        for (int i = 2; i <= givenNumber/2 ; i++) {
            t=givenNumber%i;
            if(t==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(givenNumber+" is a Prime Number");
        }else {
            System.out.println(givenNumber+" is NOT a Prime Number");
        }


    }

    }

