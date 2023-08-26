import java.util.*;
import java.lang.Math;

public class BasicCLAssgmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // que1 : Area Of Circle Java Program

        // solution
        
        /* System.out.println("Enter radius of circle: ");
        float r = sc.nextFloat();
        System.out.println("Area of circle: "+(3.14*r*r)); */

        // que 2: Area Of Triangle

        // solution
        /* System.out.println("Enter height of Triangle: ");
        float h = sc.nextFloat();
        System.out.println("Enter base of triangle: ");
        float b = sc.nextFloat();
        System.out.println("Area of Triangle: "+(0.5*b*h)); */

        // que 3: Area Of Rectangle Program

        // solution

        /* System.out.println("Enter length: ");
        float l = sc.nextFloat();
        System.out.println("Enter breadth: ");
        float b = sc.nextFloat();
        System.out.println("Area of rectangle = "+(l*b)); */


        // que 4: Area Of Equilateral Triangle

        // solution:

        /* System.out.println("Enter side of Triangle: ");
        float side = sc.nextFloat();
        System.out.println("Area = "+(Math.sqrt(3)/4*side*side)); */

        // que 5 : Perimeter Of Circle

        // solution

        /* System.out.println("Enter radius of cirle: ");
        float r = sc.nextFloat();
        System.out.println("Perimeter = "+(2*3.14*r)); */

        // que 6 : Perimeter Of Parallelogram

        // solution 
         
        /* System.out.println("Enter base of //:  ");
        float b = sc.nextFloat();
        System.out.println("Enter height of //:");
        float h = sc.nextFloat();
        System.out.println("Perimeter = "+(2*(b+h))); */

        // que 7: Volume Of Cone Java Program

        // solution 

        /* System.out.println("Enter radius of cone: ");
        float r = sc.nextFloat();
        System.out.println("Enter height of cone: ");
        float h = sc.nextFloat();
        System.out.println("Volume = "+(3.14*r*r*(h/3))); */

        // que 8: Volume Of Cylinder

        // solution

        /* System.out.println("Enter radius: ");
        float r  = sc.nextFloat();
        System.out.println("Enter height: ");
        float h = sc.nextFloat();
        System.out.println("Volume = "+(3.14*r*r*h)); */

        // que 9: Volume Of Sphere

        // solution

        /* System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        System.out.println("volume = "+(1.33*3.14*r*r*r)); */


        // que 10: Volume Of Pyramid

        // solution

        /* System.out.println("Enter length: ");
        float l = sc.nextFloat();
        System.out.println("Enter width: ");
        float w = sc.nextFloat();
        System.out.println("Enter height: ");
        float h = sc.nextFloat();
        System.out.println("volume = "+((l*w*h)/3)); */

        // que 11:Subtract the Product and Sum of Digits of an Integer

        // solution

        /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int prod = 1;
        int sum = 0;
        while(num != 0 ){
            int r = num%10;
            prod *= r;
            sum += r;
            num /= 10;

        }

        System.out.println("Answer = "+(prod-sum)); */


        // que 12: Input a number and print all the factors of that number (use loops).

        // solution

        /* System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors are: ");
        for(int i=1;i<num/2+1;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        } */


        // que 13: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        // solution

        /* int num = 1;
        int sum = 0;
        System.out.println("Enter the numbers");
        while(num != 0){
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("sum = "+sum); */

        // que 14: Take integer inputs till the user enters 0 and print the largest number from all.

        // solution

        /* System.out.println("Enter numbers: ");
        int num = 1;
        int max = 0;
        while(num != 0){
            num = sc.nextInt();
            if(max < num){
                max = num;
            }
        }
        System.out.println("Largest number = "+max); */


        sc.close();
    }
}
