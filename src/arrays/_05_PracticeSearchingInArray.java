package arrays;

import java.util.Arrays;

public class _05_PracticeSearchingInArray {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        /*

        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
         */
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        boolean hasMouse = false;
        for (String object : objects) {
            if (object.equals("Mouse")){
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);

        System.out.println("\n--------TASK-2--------\n");

        /*

        Check the collection you have above and print true if one of the element is board
        Print false otherwise
         */
        boolean hasBoard = false;
        for (String object : objects) {
            if (object.equals("board")){
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasBoard);

        System.out.println("\n--------TASK-3--------\n");
        /*
        Check if you have an element equals to "iPad"
        If so,print true
        Else, print false
         */
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0);

        System.out.println("\n--------TASK-4--------\n");

        /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3

        RESULT:
        true
        true
        true
        false
        */

        int[] nums = {5, -2, 0, -7, 0, 5, 8,45,53};
        Arrays.sort(nums);

        System.out.println(Arrays.binarySearch(nums, 5) >= 0);
        System.out.println(Arrays.binarySearch(nums, 0) >= 0);
        System.out.println(Arrays.binarySearch(nums, 45) >= 0);
        System.out.println(Arrays.binarySearch(nums, 3) >= 0);
        System.out.println(Arrays.binarySearch(nums, -7) >= 0);

    }
}
