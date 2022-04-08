package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n--------TASK-2--------\n");

        List<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("Brown");
        colorList.add("Red");
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Purple");

        System.out.println(colorList.get(1));
        System.out.println(colorList.get(3));
        System.out.println(colorList.get(5));
        System.out.println(colorList);

        System.out.println("\n--------TASK-3--------\n");

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(23);
        numberList.add(-34);
        numberList.add(-56);
        numberList.add(0);
        numberList.add(89);
        numberList.add(100);

        System.out.println(numberList);
        Collections.sort(numberList);
        System.out.println(numberList);

        System.out.println("\n--------TASK-4--------\n");

        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n--------TASK-5--------\n");

        List<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panter");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");

        System.out.println(marvelCharacters);
        System.out.println(marvelCharacters.contains("Wolwerine"));

        System.out.println("\n--------TASK-6--------\n");

        List<String> avengersCharacters = new ArrayList<>();
        avengersCharacters.add("Hulk");
        avengersCharacters.add("Black Widow");
        avengersCharacters.add("Captain America");
        avengersCharacters.add("Iron Man");

        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        System.out.println(avengersCharacters.contains("Hulk") && avengersCharacters.contains("Iron Man"));

        System.out.println("\n--------TASK-7--------\n");

        List<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (Character c : chars) {
            System.out.println(c);
        }

        System.out.println("\n--------TASK-8--------\n");

        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        int countA = 0;
        int countHasNoAOrE = 0;

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) countA++;
            if (!(object.toLowerCase().contains("a") || object.toLowerCase().contains("e"))) countHasNoAOrE ++;
        }

        System.out.println(countA);
        System.out.println(countHasNoAOrE);

        System.out.println("\n--------TASK-9--------\n");

        List<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        System.out.println(kitchenObjects);
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countHasP = 0;
        int countStartsWithOrEndsWithP = 0;

        for (String kitchenObject : kitchenObjects) {
            if (Character.isUpperCase(kitchenObject.charAt(0))) countUpperCase++;
            else countLowerCase ++;
            if (kitchenObject.toLowerCase().contains("p")) countHasP ++;
            if(kitchenObject.toLowerCase().startsWith("p") || kitchenObject.toLowerCase().endsWith("p")) countStartsWithOrEndsWithP++;
        }

        System.out.println("Elements starts with uppercase = " + countUpperCase);
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements having P or p= " + countHasP);
        System.out.println("Elements starting or ending with P or p = " + countStartsWithOrEndsWithP);

        System.out.println("\n--------TASK-10--------\n");
        List<Integer> numbersT10 = new ArrayList<>();
        numbersT10.add(3);
        numbersT10.add(5);
        numbersT10.add(7);
        numbersT10.add(10);
        numbersT10.add(0);
        numbersT10.add(20);
        numbersT10.add(17);
        numbersT10.add(10);
        numbersT10.add(23);
        numbersT10.add(56);
        numbersT10.add(78);

        System.out.println(numbersT10);

        int countDividedBy10 = 0;
        int countEvenAndGreaterThan15 = 0;
        int countOddAndLessThan20 = 0;
        int countLessThan15OrGreaterThan50 = 0;

        for (Integer integer : numbersT10) {
            if (integer % 10 == 0) countDividedBy10++;
            if (integer % 2 == 0 && integer > 15) countEvenAndGreaterThan15++;
            if (integer % 2 == 1 && integer < 20) countOddAndLessThan20++;
            if (integer < 15 || integer > 50) countLessThan15OrGreaterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenAndGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddAndLessThan20 );
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLessThan15OrGreaterThan50);

        String a = "Hiabc";
        String b = "Abc";

        System.out.println(a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase()));


    }
}
