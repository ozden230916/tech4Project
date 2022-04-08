package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
        //TASK-1
        public static void findGreatestAndSmallestWithSort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Smallest = " + arr[0]);
        System.out.println("Greatest = " + arr[arr.length - 1]);
    }
    //TASK-2
    public static void findGreatestAndSmallest(int[] arr){
            int smallest = Integer.MAX_VALUE;
            int greatest = Integer.MIN_VALUE;

        for (int element : arr) {
            if(element < smallest) smallest = element;
            else if (element > greatest) greatest = element;
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    //TASK-3
    public static void findSecondGreatestAndSmallestWithSort(int[] arr){
            Arrays.sort(arr);

            int secondSmallest = Integer.MAX_VALUE;
            int secondGreatest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length - 1; i ++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }
        for (int i = arr.length - 2; i > 0 ; i--) {
            if (arr[i] != arr[arr.length - 1]){
                secondGreatest = arr[i];
                break;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    //TASK-4

    public static void findSecondGreatestAndSmallest(int[] arr){
            int greatest = Integer.MIN_VALUE;
            int secondGreatest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element > greatest && element > secondGreatest){
                secondGreatest = greatest;
                greatest = element;
            }
             else if (element > secondGreatest && element != greatest){
                secondGreatest = element;
            }
             if ( element < smallest && element < secondSmallest){
                secondSmallest = smallest;
                smallest = element;
            }
            else if( element < secondSmallest && element != smallest){
                secondSmallest = element;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    //TASK- 5

    public static void findDuplicatedElementsInAnArray(String[] arr){
        ArrayList<String> duplicated = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (!duplicated.contains(arr[i]) && arr[i].equals(arr[j])) duplicated.add(arr[i]);
            }
        }
        for (int i = 0; i < duplicated.size(); i++) {
            System.out.println(duplicated.get(i));
        }
    }
    //TASK-6
    public static void findMostRepeatedElementInAnArray(String[] arr){
            String element = "";
            int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String mostDuplicatedElement = arr[i];
            int mostDuplicatedCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) mostDuplicatedCount ++;
            }
            if (mostDuplicatedCount > count){
                element = mostDuplicatedElement;
                count = mostDuplicatedCount;
            }
        }
        System.out.println(element);

        /*
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }

         */
    }

    public static void main(String[] args) {
        System.out.println("\n------TASK-1------");
        Project07.findGreatestAndSmallestWithSort(new int[]{10, 7, 7, 10, - 3, 10, -3});

        System.out.println("\n------TASK-2------");
        Project07.findGreatestAndSmallest(new int[]{10, 7, 7, 10, - 3, 10, -3});

        System.out.println("\n------TASK-3------");
        Project07.findSecondGreatestAndSmallestWithSort(new int[] {10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n------TASK-4------");
        Project07.findSecondGreatestAndSmallest(new int[]{10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n------TASK-5------");
        Project07.findDuplicatedElementsInAnArray(new String[]{"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"});

        System.out.println("\n------TASK-6------");
        Project07.findMostRepeatedElementInAnArray(new String[]{"pen", "eraser", "pencil","pen", "123", "abc", "pen", "eraser"});


    }


}
