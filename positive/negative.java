import java.util.*;
public class  negative{
    public static void main(String args[]){
        int no = 5;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = inp.nextInt();
        if(n>=0){
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The numbr is Negative");
        }
    }
}
