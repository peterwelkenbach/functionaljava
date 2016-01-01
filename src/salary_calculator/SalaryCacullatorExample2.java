package salary_calculator;


public class SalaryCacullatorExample2 {
    public static void main(String[] args ) {
        System.out.println("Here we go ...");

        double baseSalary = 2345.50;

        SalaryCalculator2 calculator = new SalaryCalculator2();

        double salary = calculator
                .with( SalaryRules::bonus )
                .with( SalaryRules::tax)
                .calculate( baseSalary);

        System.out.println( "Result: " + salary );

        double expected = 2345.50 * 1.1 * 0.7;
        System.out.println(" must be: " + expected );

        System.out.println("Well done Dude");
    }
}

