package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
*/
        int random = (int)(Math.random() * 101 - 50);
        System.out.println("Number = " + random);
        int points = 0;

        if (random > 0){
            points +=10;
            if (random == 7){
                points += 100;
            }
            if(random > 25){
                points += 10;
            }
        }
        if (random == -7) {
            points += 10;
        }
        System.out.println("Points = " + points);
    }
}
