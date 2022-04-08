package arrays;

import java.util.Arrays;

public class _02_PracticeStringArray {
    public static void main(String[] args) {
        System.out.println("\n------TASK-1------\n");
        /*
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));

        System.out.println("\n------TASK-2------\n");
        /*
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom
         */
        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length - 1]);

        System.out.println("\n------TASK-3------\n");
        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]
        Count how many names starts with A

        Expected :
        Result
         */
        //1st way
        int count = 0;
        for (String student : students){
            if (student.charAt(0) == 'A') count ++;
        }
        System.out.println(count);

        //second way
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].charAt(0) == 'A') count ++;
        }
        System.out.println(count);

        //third way
        count = 0;
        for (String student : students){
            if (student.charAt(0) == 65) count ++;
        }
        System.out.println(count);

        System.out.println("\n------TASK-4------\n");

        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]
        count how many names contains a-A or e-E

        EXPECTED RESULT:
        5
         */

        int countAOrE = 0;
        for (String student : students){
            if (student.toLowerCase().contains("a") || student.toLowerCase().contains("e") ) countAOrE++;
        }
        System.out.println(countAOrE + " names contains a-A or e-E");

        System.out.println("\n------TASK-5------\n");
        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
         */

        int countLength5 = 0;
        for (String student: students){
            if (student.length() >= 5) countLength5 ++;
        }
        System.out.println(countLength5 + " names have at least 5 characters");

        System.out.println("\n------TASK-6------\n");
        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
         */

        boolean hasJennifer = false;
        for (String student : students){
            if (student.equals("Jennifer")) hasJennifer = true;
            break;
        }
        System.out.println(hasJennifer);







    }
}
