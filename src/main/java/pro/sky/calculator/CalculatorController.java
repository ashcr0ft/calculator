package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не задан");
        }
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не задан");
        }
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не задан");
        }
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не задан");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return calculatorService.divide(num1, num2);
    }
}
