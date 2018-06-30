package PowtorzenieWiadomosci1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("********Zadanie1*************");
        String name = "Maciej";
        String surname = "Holysz";
        Zadanie1 zadanie1 = new Zadanie1(name, surname);
        System.out.printf("Modulo for %s %s is equal: %d", name, surname, zadanie1.getModulo());

        System.out.println("\n");
        System.out.println("********Zadanie3*************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give first tringle side: ");
        int a = sc.nextInt();
        System.out.println("Give second tringle side: ");
        int b = sc.nextInt();
        System.out.println("Give third tringle side: ");
        int c = sc.nextInt();

        Zadanie3 triangle = new Zadanie3(a, b, c);

        System.out.println("Is it triangle: " + triangle.isItTriangleRectangular());
        System.out.println("Hypotenuse is equal: " + triangle.hypotenuse());
        System.out.println("Circuit is equal: " + triangle.circuit());
        System.out.println("Area is equal: " + triangle.area());
    }
}
