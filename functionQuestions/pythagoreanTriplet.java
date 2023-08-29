package functionQuestions;

public class pythagoreanTriplet {
    
    static boolean isTriplet(int a, int b, int c){
        return (a*a)+(b*b) == (c*c)?true:false;
    }


    public static void main(String[] args) {

        if(isTriplet(2, 4, 5)){
            System.out.println("Its a triplet");
        }else{
            System.out.println("Its not a triplet");
        }
        
    }
}
