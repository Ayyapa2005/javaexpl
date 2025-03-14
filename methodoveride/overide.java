class tiger {
    public static void beha(){
        System.out.println("Tiger is Roring");
    }
}
class lion extends tiger{
    public static void beha(){
        System.out.println("Lion is roaring");
    }
}
public class overide{
    public static void main(String args[]){
        tiger ti = new tiger();
        lion li = new lion();
        ti.beha();
        li.beha();
    }
}