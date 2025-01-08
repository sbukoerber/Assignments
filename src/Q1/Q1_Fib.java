/*Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5 */


package Q1;

public class Q1_Fib {
    public float fibonacciSeries(){
        int m=1,n=1,p,sum=0, average;
        System.out.println("The first 20 Fibonacci numbers are:");
        System.out.print(m+" "+n);
        for(int i=1;i<=20;i++){
            sum=sum+m;
            p=m+n;
            System.out.print(" "+p);
            m=n;
            n=p;
        }
        average=sum/20;
        return average;
    }

    public static void main(String[] args) {
        Q1_Fib fib=new Q1_Fib();
        float avg= fib.fibonacciSeries();
        System.out.println("\nThe average is "+avg);
    }
}
