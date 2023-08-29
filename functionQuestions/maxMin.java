package functionQuestions;

public class maxMin {

    static void max(int a, int b, int c){
        System.out.println("Maximum Number: "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
    static void min(int a, int b, int c){
        System.out.println("Minimum Number: "+(a<b?(a<c?a:c):(b<c?b:c)));
    }


    public static void main(String[] args) {
        max(2,5,4);
        min(3,1,4);
    }   
    
}
