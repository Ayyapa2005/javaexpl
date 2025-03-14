public class cal{
    public static int  sum(int a,int b){
         int sum = a+b;
         return sum;
    }
    public static int sum(int a, int b,int c){
        int sum = a+b+c;
        return sum;
    }
    
 
     
    public static int subtract(int a, int b){
         int sub = a-b;
         return sub;
     }
    public static int divide(int a, int b){
         int div = a/b;
         return div;
     }
 }
 public class usermeth{
    public static void main(String args[]){
         int sumre=cal.sum(2,3);
         int subre = cal.subtract(5,3);
         int divre = cal.divide(10,2);
         int su = cal.sum(3,4,6);
         System.out.println("sum of two number is "+sumre);
         System.out.println("subtraction of two number is "+subre);
         System.out.println("division of two number is "+divre);
         System.out.println("sum is "+su);
     }
 }