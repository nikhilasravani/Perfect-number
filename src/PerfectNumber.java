import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check whether it is perfect or not : ");
        int n = input.nextInt();
        findPerfect(n);
    }
    public static void findPerfect(int n){
        int sum =0;
        int i = 1;
        while(i<=n){
            if(n%i == 0){
                sum += i;
            }
            i++;
        }
        if(n == sum-n){
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
    }
}
