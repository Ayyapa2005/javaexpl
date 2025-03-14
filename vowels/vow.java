import java.util.*;
public class  vow{
    public static void main(String args[]){
        String[] vowels={"a","A","e","E","i","I","o","O","u","U"};
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a letter: ");
        String letter = inp.nextLine();
        for(String l : vowels){
            if(l.equals(letter)){
                System.out.println("It is a vowle");
               
            }
            else{
                System.out.println("it is not vowel");
            }
           
        }
       
         
            
        
        
    }
}