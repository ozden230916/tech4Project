package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {
        /*
        write a program which take two numbers as a STRING and get the average of them
        and print it out
         */
        String num1 = "23";
        String num2 = "25";

        double num1Double = Double.parseDouble(num1);
        double num2Double = Double.parseDouble(num2);

        System.out.println("Average of given numbers = " + (num1Double + num2Double)/2);

        double num1ValueOf = Double.valueOf(num1);
        double num2ValueOf = Double.valueOf(num2);

        System.out.println("Average og given numbers = " + (num1ValueOf + num2ValueOf) / 2);

        /*
        Assume David is going to save  $390 to buy a bicycle.
        David can save only $15.60 per day. How many days later,
        David can save $390 and buy the bicycle.

        Requirement:
        Write a java program to solve this problem given above

        Input:
        String save = 390;
        String day = 15.60;

        Expected Output:
        25
         */
        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        int dayNeed = (int) (saveDouble / dayDouble);
        System.out.println(dayNeed);


    }
}
