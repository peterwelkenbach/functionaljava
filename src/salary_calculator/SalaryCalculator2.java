package salary_calculator;


import java.util.function.Function;

public class SalaryCalculator2 {

    private  Function<Double, Double> calc = Function.identity();


    public SalaryCalculator2() {
    }

    private SalaryCalculator2( Function<Double, Double> calc ) {
      this.calc = calc;
    }

    public SalaryCalculator2 with( Function<Double, Double> f ) {
        return new SalaryCalculator2(( calc.andThen(f)));
    }

    public double calculate( double basic) {
        return calc.apply( basic );
    }
}



