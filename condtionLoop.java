import java.util.*;

public class condtionLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // que 1 : occurences

        //SOLUTION

        /* System.out.println("Enter a num: ");
        int num = sc.nextInt();
        System.out.println("Enter the number whose occurences you want to find: ");
        int occ = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp !=0 ){
            int r = temp % 10;
            if(r == occ){
                count++;
            }
            temp = temp/10;
        }
        System.out.println("number of occurences: " + count); */


        // que 2 : Reverse of a number

        // solution

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int r = temp%10;
            rev = rev * 10 + r;
            temp = temp / 10;

        }
        System.out.println("Reverse of a number: "+rev);


    }
}
