package com.example.jettrxjavademo_20201014;


import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
        Pizza x=new BasePizza();

        PizzaA p=new PizzaA(new PizzaB(new PizzaC(x)));
        p.show();

    }

}