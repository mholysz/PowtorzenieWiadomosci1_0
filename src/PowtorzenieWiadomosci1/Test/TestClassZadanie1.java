package PowtorzenieWiadomosci1.Test;


import PowtorzenieWiadomosci1.Zadanie1;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClassZadanie1 {

    @Test
    public void whenAskInitiatedHashMapToReturnResultOnA(){
        Zadanie1 zadanie1 = new Zadanie1("Maciek", "Holysz");
        assertEquals(1, zadanie1.hashMapReturn('A'));
    }

    @Test
    public void whenGiveJanUlReturnZero(){
        Zadanie1 zadanie1 = new Zadanie1("Jan", "Ul");
        zadanie1.setModulo();
        assertEquals(0, zadanie1.getModulo());
    }

    @Test
    public void whenGiveMaciejHolyszReturnZero(){
        Zadanie1 zadanie1 = new Zadanie1("Maciej", "Holysz");
        zadanie1.setModulo();
        assertEquals(0, zadanie1.getModulo());
    }

}
