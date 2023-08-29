package functionQuestions;

public class evenOdd {
    
    static boolean isEven(int a){
        return a%2==0?true:false;
    }

    public static void main(String[] args) {
        
        if(isEven(7)){
            System.out.println("Its a Even number");
        }else{
            System.out.println("Its a odd number");
        }
    }
}
