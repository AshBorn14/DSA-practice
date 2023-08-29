package functionQuestions;

public class voteEligible {
    
    static boolean isEligible(int age){
        return age>=18?true:false;
    }


    public static void main(String[] args) {
        
        if(isEligible(14)){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }
    }
}
