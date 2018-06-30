package PowtorzenieWiadomosci1;

public class Main {
    public static void main(String[] args) {

        System.out.println("********Zadanie1*************");
        String name = "Maciej";
        String surname = "Holysz";
        Zadanie1 zadanie1 = new Zadanie1(name, surname);
        System.out.printf("Modulo for %s %s is equal: %d", name, surname, zadanie1.getModulo());


        
    }
}
