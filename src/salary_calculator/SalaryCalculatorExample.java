package salary_calculator;


public class SalaryCalculatorExample {
    public static void main(String[] args ) {
        System.out.println("Here we go ...");

        double baseSalary = 2300.50;

        SalaryCalculator calculator = new SalaryCalculator();

        double salary = calculator
                            .with( SalaryRules::bonus )
                            .with( SalaryRules::tax)
                            .calculate( baseSalary);

        System.out.println( "Result: " + salary );

        double expected = 2300.50 * 1.1 * 0.7;
        System.out.println(" must be: " + expected );

        System.out.println("Well done Dude");
    }
}
