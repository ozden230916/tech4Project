package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] studentGroups = {
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };

        System.out.println(studentGroups[0][1]);
        System.out.println(studentGroups[1][0]);
        System.out.println(studentGroups[1][1]);

        //how to get the size of the group2
        System.out.println(studentGroups[1].length);

        //how to print the third group
        System.out.println(Arrays.toString(studentGroups[2]));

        //how to print all
        System.out.println(Arrays.deepToString(studentGroups));

        //how to print each group in separate line



        for (String[] studentGroup : studentGroups) {
            System.out.println(Arrays.toString(studentGroup));

        }
        // how to print all members in separate line

        System.out.println("----fori loop");

        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);
            }
        }
        System.out.println("----for each loop");
        for (String[] studentGroup : studentGroups) {
            for (String member : studentGroup) {
                System.out.println(member);

            }

        }


    }
}
