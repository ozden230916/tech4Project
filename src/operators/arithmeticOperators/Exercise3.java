package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

         /*
        PSEUDO CODE
        1.Create a variables to annual salary
        2.Find monthly salary dividing annual salary by 12
        3.Find bi-weekly salary dividing annual salary by 26
        4.Find weekly salary dividing annual salary by 52
        5.Print the monthly, bi-weekly and weekly salary
         */
        double annualSalary = 90000;

        double monthlySalary = annualSalary / 12;
        double biWeeklySalary = annualSalary / 26;
        double weeklySalary = annualSalary / 52;

        System.out.println("Monthly Salary = " + monthlySalary);
        System.out.println("Bi-weekly Salary = " + biWeeklySalary);
        System.out.println("Weekly Salary = " + weeklySalary);

    }
}
