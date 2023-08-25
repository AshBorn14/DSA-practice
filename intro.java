import java.util.*;

public class intro{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        // que 1: Write a program to print whether a number is even or odd, also take input from the user.

        // solution

        /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        } */

        // que 2 : Take name as input and print a greeting message for that particular name.

        // Solution

       /*  System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Good morning "+name); */

        // que 3 : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        // solution

        /* System.out.print("Enter principal amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time period: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        float si  = (p*r*t)/100;
        System.out.println("Simple interest = "+ si); */

        // que 4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        // solution

        /* System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float result;
        System.out.println("Enter operator: ");
        char op = sc.next().charAt(0);

        if(op == '+'){
        
            System.out.println("Sum = "+ (num1+num2));
        }else if(op == '-'){
            System.out.println("Sum = "+ (num1-num2));
        }else if(op == '*'){
            System.out.println("Product = "+(num1*num2));
        }else if(op == '/'){
            System.out.println("Division = "+(num1/num2));
        }else{
            System.out.println("Invalid operator");
        } */


        // que 5 : Take 2 numbers as input and print the largest number.

        // solution

        /* System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Largest number = "+(num1>num2?num1:num2)); */

        // que 6 : Input currency in rupees and output in USD.

        // solution

        /* System.out.println("Enter currency in INR: ");
        float rs = sc.nextFloat();
        System.out.println("Curreny in USD = "+(rs*0.012)); */


        // que 7 : To calculate Fibonacci Series up to n numbers.

        // solution

        /* System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int third;

        System.out.print(first+" "+second+" ");

        for(int i=2;i<n;i++){
            third = first+second;
            first = second;
            second = third;
            System.out.print(third + " ");
        } */


        // que 8 : To find out whether the given String is Palindrome or not.

        // solution

        /* System.out.println("Enter a string: ");
        String str = sc.next();
        String rvstr = "";
        for(int i=str.length()-1;i>=0;i--){
            rvstr += str.charAt(i);
        }
        System.out.println(rvstr);

        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i) != rvstr.charAt(i)){
                System.out.println("Not a palindrome");
                break;
            }
        }
        if(i==str.length()){
            System.out.println("Its a palindrome");
        } */


        // que 9 : To find Armstrong Number between two given number.


        // solution

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=num1;i<=num2;i++){
            int temp = i;
            int arm = 0;
            while(temp != 0){
                int r = temp%10;
                arm = arm + (r*r*r);
                temp = temp / 10;
            }
            if(arm == i){
                System.out.println(arm + " is a armstrong number");
            }
        }

    }
}