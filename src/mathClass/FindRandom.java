package mathClass;

public class FindRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random); // it can be 0 but it can not be 1

        int random0And10Included = (int) (Math.random() * 11);
        System.out.println(random0And10Included);

        //create a random number between 0 and 20 included.Take the result as an int

        int random0And20Included = (int)(Math.random()*21);
        System.out.println(random0And20Included);

        //create a random number between 10 and 20 included.Take the result as an int

        int random10And20Included = (int)(Math.random()*11 + 10);
        System.out.println(random10And20Included);

        //create a random number between 103 and 346 included.Take the result as an int

        int random103And346Included = (int)(Math.random()*244 + 103);
        System.out.println(random103And346Included);

        //create a random number between -50 and 50 included.Take the result as an int
        int random_50And50Included = (int)(Math.random()*101 -50);
        System.out.println(random_50And50Included);

        //create a random number between 15 and 30 included.Take the result as an int
        int randomBetween15And30 = (int)(Math.random()*16 + 15);
        System.out.println(randomBetween15And30);





    }
}
