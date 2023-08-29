package functionQuestions;

public class factorial {
    

    static int fact(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact *=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of "+num+" = "+fact(num));
    }
}
