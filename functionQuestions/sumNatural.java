package functionQuestions;

public class sumNatural {
    
    static int sumN(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Sum of all numbers: "+sumN(10));
    }
}
