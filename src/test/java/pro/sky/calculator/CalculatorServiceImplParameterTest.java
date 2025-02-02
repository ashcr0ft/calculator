package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.Service.CalculatorInterface;
import pro.sky.calculator.Service.CalculatorServiceImpl;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorServiceConstant.*;

public class CalculatorServiceImplParameterTest {

    private final CalculatorInterface out = new CalculatorServiceImpl();

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void plus_test (Integer num1, Integer num2){
        assertEquals(num1 + num2, out.plus(num1,num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void minus_test (Integer num1, Integer num2){
        assertEquals(num1 - num2, out.minus(num1,num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void multiply_test (Integer num1, Integer num2){
        assertEquals(num1 * num2, out.multiply(num1,num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void divide_test (Integer num1, Integer num2){
        assertEquals(num1 / num2, out.divide(num1,num2));
    }

    public static Stream<Arguments> provideArguments(){
        return Stream.of(
        Arguments.of(ONE, TWO),
        Arguments.of(ZERO, ONE),
        Arguments.of(ONE, THREE),
        Arguments.of(THREE, TWO),
        Arguments.of(ONE, ONE));
    }

}
