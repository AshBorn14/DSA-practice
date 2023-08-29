package functionQuestions;

public class primeNum {
    

    static boolean isPrime(int num){
        for(int i = 2;i*i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPrime(70)?"Its a prime number":"Its not a prime number");
    }
}
