package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Write a program that is gonna create 3 random numbers
        between 45-90. Print out the all the numbers max, min,
        and the middle.

        56, 78, 63
        output:
        num1= 56
        num2= 78
        num3= 63
        max= 78
        min= 56
        middle= 63
        */
        int number1 = (int)(Math.random()*46 + 45);
        int number2 =(int)(Math.random()*46 + 45);
        int number3 =(int)(Math.random()*46 + 45);

        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        int mid = 0;



      /* if(number1 != max && number2 != min ){
           mid = number1;
       }
       if (number2 != max && number2 != min){
          mid = number2;
       }
       if (number3 != max && number3 != min){
          mid = number3;
       }*/

        if(number1 != max && number1 != min) mid = number1;
        else if (number2 != max && number2 != min) mid = number2;
        else mid = number3;

        System.out.println("number1 = " + number1 +
                "\nnumber2 = " + number2 +
                "\nnumber3 = " + number3 +
                "\nmax = " + max +
                "\nmin = " + min +
                "\nmiddle = " + mid);


    }



}
