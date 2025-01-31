package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.Exeptions.DivisionException;
import pro.sky.calculator.Service.CalculatorInterface;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiceConstant.*;

public class CalculatorServiceImplTest {

    private final CalculatorInterface out = new CalculatorServiceImpl();


    @Test
    public void plus_should_give_me_3() {
        assertEquals(THREE, out.plus(ONE, TWO));
    }

    @Test
    public void minus_should_give_me_1() {
        assertEquals(ONE, out.minus(TWO, ONE));
    }

    @Test
    public void multiply_should_give_me_2() {
        assertEquals(TWO, out.multiply(TWO, ONE));
    }

    @Test
    public void divide_should_give_me_2() {
        assertEquals(TWO, out.divide(TWO, ONE));
    }

    @Test
    public void divide_should_give_me_Exception() {
        assertThrows(DivisionException.class, () -> out.divide(THREE, ZERO));
    }

}
