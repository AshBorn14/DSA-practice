import java.util.*;
import java.lang.Math;

public class InterCLAssgmt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // que: 1 Factorial Program In Java

        // solution

        /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = num; i > 0;i--){
            fact *= i;
        }
        System.out.println("Factorial = "+fact); */



        // que: 2 Calculate Electricity Bill

        // solution

        /* System.out.println("Enter number of Units: ");
        float unit = sc.nextFloat();
        float fixedCharge = 40f;
        float subsidy = unit * 1.83f;
        float energyCharges = 1f;
        if(unit <= 100){
            energyCharges = unit * 6.05f;
        }else if(unit <= 200){
            energyCharges = (100 * 6.05f) + ((unit-100)*6.85f);
        }else if(unit <= 300){
            energyCharges = (100*6.05f) + (100*6.85f) + ((unit-200) * 7.70f);
        }else if(unit > 300){
            energyCharges = (100*6.05f) + (100*6.85f) + (100*7.70f) + ((unit-300)*8.50f);
        }
        float totalBill = energyCharges + fixedCharge - subsidy;
        System.out.println("Total electricity bill = "+totalBill); */


        // que: 3 Calculate Average Of N Numbers

        // solution
        /* System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " values: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            sum += temp;
        }
        float average = (float)sum/n;
        System.out.println("Average = "+ average); */

        // que: 4 Calculate Discount Of Product

        // solution

        /* System.out.println("Enter price of product: ");
        float price = sc.nextFloat();
        System.out.println("Enter discount % : ");
        float discount = sc.nextInt();
        discount = (discount / 100) * price;
        System.out.println("Billing price of product = "+ (price - discount)); */

        // que: 5 Calculate Distance Between Two Points

        // solution

       /*  System.out.println("Enter coordinated of first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinated of first point:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Distance = "+ distance); */

        // que: 6 Calculate Commission Percentage

        // solution

        /* System.out.println("Enter price of unit: ");
        float unitPrice = sc.nextFloat();
        System.out.println("Enter commission rate: ");
        float commissionRate = sc.nextFloat();
        float commissionPerce = (commissionRate / unitPrice) * 100;
        System.out.println("Commission %  = "+commissionPerce); */


        // que: 7 Power In Java

        // solution

        /* System.out.println("Enter base value: ");
        int base = sc.nextInt();
        System.out.println("Enter power: ");
        int exp = sc.nextInt();
        int pow = 1;
        for(int i=1;i<=exp; i++){
            pow = pow *base;
        }
        System.out.println("Power of a number: "+pow); */

        // que: 8 Calculate Depreciation of Value

        // solution

        /* System.out.println("Enter asset cost: ");
        float assetCost = sc.nextFloat();
        System.out.println("Enter salvage value: ");
        float salvageValue = sc.nextFloat();
        System.out.println("Enter useful life in years: ");
        float usefulLife = sc.nextFloat();
        float depreciation = (assetCost - salvageValue) / usefulLife;
        System.out.println("Depreciation value = "+depreciation); */


        // que: 9 Calculate Batting Average

        // solution

        /* System.out.println("Enter total run scored: ");
        int runs = sc.nextInt();
        System.out.println("Number of times player got out: ");
        int out = sc.nextInt();
        System.out.println("Batting Average = "+((float)runs/out)); */

        // que: 10 Calculate CGPA Java Program

        // solution
        /* System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();
        int gradeSum = 0;
        System.out.println("Enter marks of "+n+" subjects");
        for(int i=0;i<n;i++){
            int tempMarks = sc.nextInt();
            if(tempMarks>90){
                gradeSum += 10;
            }else if(tempMarks > 80){
                gradeSum += 9;
            }else if(tempMarks > 70){
                gradeSum += 8;
            }else if(tempMarks > 60){
                gradeSum += 7;
            }else if(tempMarks > 50){
                gradeSum += 6;
            }else if(tempMarks > 40){
                gradeSum += 5;
            }else if(tempMarks > 32){
                gradeSum += 4;
            }
        }
        System.out.println("CGPA = "+((float)gradeSum/n)); */

        // que: 11 Compound Interest Java Program

        // solution

        /* System.out.println("Enter principle amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter times(in years): ");
        float t = sc.nextFloat();
        double amount = p* Math.pow((1+(r/100)), t);
        System.out.println("Compound interest  = "+ amount); */

        // que: 12 Armstrong Number In Java

        // solution

      /*   System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int arm = 0;
        while(temp != 0){
            int r = temp%10;
            arm = arm + r*r*r;
            temp /= 10;
        }
        if(arm == num){
            System.out.println("Its a armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        } */


        // que: 13 Reverse A String In Java

        // solution

        /* System.out.println("Enter a string: ");
        String str = sc.next();
        String rvString = "";
        for(int i = str.length()-1;i>=0;i--){
            rvString += str.charAt(i);
        }
        System.out.println("Reverse = "+rvString); */

        // que: 14 HCF Of Two Numbers Program

        // solution

        /* System.out.println("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = num1>num2? num1:num2;
        while(hcf > 0){
            if(num1%hcf == 0 && num2%hcf == 0){
                System.out.println("Hcf = "+hcf);
                break;
            }
            hcf--;
        } */

        // que: 15 LCM Of Two Numbers

        // solution

        /* System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = num1>num2?num1:num2;
        while(true){
            if(lcm%num1 == 0 && lcm%num2 == 0){
                System.out.println("Lcm = "+lcm);
                break;
            }
            lcm++;
        } */



        // que: 16 Java Program Vowel Or Consonant

        // solution

        /* System.out.println("Enter a string: ");
        String str = sc.next();
        str = str.toLowerCase();
        int vowel=0;
        int consonant = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c=='i' || c=='e' || c=='o' || c=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println("Vowel = "+vowel+" and Consonant = "+consonant); */

        // que: 17 Perfect Number In Java

        // solution

        /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Its a perfect number");
        }else{
            System.out.println("Its not a perfect number");
        } */


        // que: 18 Check Leap Year Or Not

        // solution

        /* System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Its "+(year%4==0?"a leap year":"not a leap year")); */

        // que: 19 Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

        // solution

        // System.out.println("No. of days kunal can go out = "+(31/2));


        // que: 20 Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

        // solution

        int Nsum = 0;
        int PEsum = 0;
        int POsum = 0;

        int num = 1;
        System.out.println("Enter numbers:");
        while(num !=0 ){
         num = sc.nextInt();
            if(num < 0){
                Nsum += num;
            }else if(num%2==0){
                PEsum += num;
            }else if(num%2 != 0){
                POsum += num;
            }
        }
        System.out.println("Negative sum = "+Nsum+", Positive Even number = "+PEsum+" and Positive Odd number = "+POsum);



        sc.close();
    }       
}
