package JavaProject;

public class Task8 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.
        int []fibo=new int[10];
        fibo[0]=0;
        fibo[1]=1;

        for (int i=2;i<fibo.length;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        for (int i=0;i< fibo.length;i++){
            System.out.println(fibo[i]+"");
        }
    }

}
