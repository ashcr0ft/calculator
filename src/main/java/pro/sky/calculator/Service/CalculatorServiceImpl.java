package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Exeptions.DivisionException;
import pro.sky.calculator.Exeptions.ParameterNotFoundException;

@Service
public class CalculatorServiceImpl implements CalculatorInterface {

    public Integer plus(Integer num1, Integer num2) {
        if (num1 != null || num2 != null) {
            return num1 + num2;
        } else {
            throw new NullPointerException("Один из параметров не задан");
        }
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 != null || num2 != null) {
            return num1-num2;
        } else {
            throw new ParameterNotFoundException("Один из параметров не задан");
        }
    }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 != null || num2 != null) {
            return num1*num2;
        } else {
            throw new ParameterNotFoundException("Один из параметров не задан");
        }
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivisionException("На 0 делить нельзя");
        }
        if (num1 != null || num2 != null) {
            return  num1/num2;
        } else {
            throw new ParameterNotFoundException("Один из параметров не задан");
        }
    }
}