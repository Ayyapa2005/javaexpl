public class usermeth{
    void add(int a,int b){
        System.out.println("sum is "+(a+b));

    }
    void add(int a,int b,int c){
        System.out.println("sum is "+(a+b+c));
        
    }
        public static void main(String args[]){
        usermeth obj=new usermeth();
        obj.add(10,20);
        obj.add(20,30,40);
    }
    }
