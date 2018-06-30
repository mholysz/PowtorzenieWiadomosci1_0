package PowtorzenieWiadomosci1;

import java.util.HashMap;

public class Zadanie1 {
    private HashMap<Character, Integer> hashMap = new HashMap<>();
    private String name;
    private String surname;
    private int modulo;

    public Zadanie1(String name, String surname) {
        this.name = name;
        this.surname = surname;
        hashMapInit();
    }

    private void hashMapInit(){
        int counter = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            hashMap.put(i, counter);
            counter++;
        }
    }


    public void showHash(){
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(hashMap.get(i));

        }
    }

    public int hashMapReturn(char letter){
        return hashMap.get(Character.toLowerCase(letter));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private int countSum() {
       char[] name = getName().toCharArray();
       char[] surname = getSurname().toCharArray();

       int sum = 0;

        for (int i = 0; i < name.length; i++) {
            sum = sum + hashMapReturn(name[i]);
        }

        for (int i = 0; i < surname.length; i++) {
            sum = sum + hashMapReturn(surname[i]);
        }
     return sum;
    }


    public void setModulo() {
        this.modulo = countSum()%2;
    }

    public int getModulo() {
        return modulo;
    }
}
