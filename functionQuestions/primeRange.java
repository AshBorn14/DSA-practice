package functionQuestions;
import java.util.*;

public class primeRange {
    
    static boolean isPrime(int num){
        for(int i = 2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Prime numbers between: ");
        for(int i = num1;i<=num2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }


}
