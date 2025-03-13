import java.util.*;
public class  major{
    public static void main(String args[]){
        int no = 5;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int n = inp.nextInt();
        if(n>=18){
            System.out.println("The persion is MAJOR");
        }
        else{
            System.out.println("The person is minor ");
        }
    }
}
