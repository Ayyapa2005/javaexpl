import java.util.*;
public class  male{
    public static void main(String args[]){
        int no = 5;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Gender: ");
        String n = inp.nextLine();
        if(n.equals("m")){
            System.out.println("HELLO SIR, PLEASE ENTER YOUR NAME: ");
        }
        else{
            System.out.println("HELLO MAM, PLEASE ENTER YOUR NAME ");
        }
    }
}
