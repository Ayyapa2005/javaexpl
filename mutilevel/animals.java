public class carni{
    public static void characters(){
        System.out.println("they eat animals as their food");
    }
}
public class Tiger extends carni{
    public static void beha(){
        System.out.println("Tiger is roaring");
        carni.characters();
    }
}
public class Lion extends Tiger{
    public static void behav(){
        System.out.println("Tiger is roaring");
        carni.characters();
        Tiger.beha();
    }
}
public class animals{
    public static void main(String args[])
    {
        Lion li = new Lion();
        li.characters();
        li.beha();
        li.behav();
    }
}