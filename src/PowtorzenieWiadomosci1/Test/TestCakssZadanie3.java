package PowtorzenieWiadomosci1.Test;

import PowtorzenieWiadomosci1.Zadanie3;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class TestCakssZadanie3 {

    Zadanie3 zadanie3;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        zadanie3 = new Zadanie3(3, 4, 5);
    }


//    @Test
//    public void whenGiveParameterBelowZeroReturnException(){
//        zadanie3 = new Zadanie3(-2,2,4);
//        exception.expect(IllegalArgumentException.class);
//    }

    @Test
    public void whenGiveSidesEqualsRectangular() {
        assertEquals(true, zadanie3.isItTriangleRectangular());
    }

    @Test
    public void whenHypotenuseEqualsFive() {
        assertEquals(5.0, zadanie3.hypotenuse());
    }

    @Test
    public void whenCiruitEqualsTwelve() {
        assertEquals(12, zadanie3.circuit());
    }

    @Test
    public void whenAreaEqualsSix() {
        assertEquals(6.0, zadanie3.area());
    }


}