import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        // fill the code
        int n,o=0,e=0,s=0,m,c=0;
        System.out.println("Enter the number\n");
        n=sc.nextInt();
        while(n%10!=n){
            s=0;
        while(n>0){
            m=n%10;
            if(c==0){
            if(m%2==0)
            e=e+1;
            else 
            o=o+1;}
            s=s+m;
            n=n/10;}
            if(c==0){
            System.out.println("Sum of digits");
            System.out.println(s);
                c=c+1;
            }
        n=s;}
        System.out.println("Numerology number\n"+s );
        System.out.println("Number of odd numbers\n"+o);
        System.out.println("Number of even numbers\n"+e);
        }
}
