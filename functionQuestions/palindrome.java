package functionQuestions;

public class palindrome {
    

    static boolean isPalindrome(int num){
        int original = num;
        int rvs = 0;
        while(num != 0){
            int r = num % 10;
            rvs = rvs * 10 + r;
            num /= 10;
        }
        if(rvs == original){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        if(isPalindrome(123)){
            System.out.println("Its a palindrome number");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}
