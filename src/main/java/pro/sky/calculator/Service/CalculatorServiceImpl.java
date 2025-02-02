package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Exeptions.DivisionException;

@Service
public class CalculatorServiceImpl implements CalculatorInterface {

    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivisionException("На 0 делить нельзя");
        }
        return num1 / num2;
    }
}