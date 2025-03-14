interface   mammal{
    public static void characters(){
        System.out.println("Mammals give birth to youg ones ");
        System.out.println("parent feeds milk to young ones ");
    }
}

interface birds{
    public static void chacracs(){
        System.out.println("Birds lay eggs");
        System.out.println("it dose not feed milk and it fly");
    }
} 
public class Bats implements mammal,birds{
    public static void main(String args[])
    {
        mammal.characters();
        birds.chacracs();
        System.out.println("bats are both bird and mammal");
    }
}
