import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in celsius: ");
        float inputTemp = sc.nextFloat();
        float outputTemp = (inputTemp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit "+outputTemp + "F");


        sc.close();
    }
}
