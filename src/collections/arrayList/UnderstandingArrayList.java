package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        //1.Declaring an Array vs ArrayList

        String[] namesArray = new String[5];
        ArrayList<String> namesList = new ArrayList<>();

        //2.How to print the size of Array and ArrayList
        System.out.println("Size of the array = " + namesArray.length);
        System.out.println("Size of the ArrayList = " + namesList.size());

        //How to add elements to Array vs ArrayList
        namesArray[0] = "Abe";



        namesList.add("Abe"); // add method that takes object
        namesList.add(0,"Abe");// add object to a specific index
        namesList.add(1, "Data");// [Abe, Data]
        namesList.add(1,"John");//[Abe, John, Data]
        namesList.add("Alona");//[Abe, John, Data, Alona]
        namesList.add("Max");//[Abe, John, Data, Alona, Max]
        namesList.add(0, "James");//[James, Abe, John, Data, Alona, Max]

        namesList.set(3, "Lionel");//[James, Abe, John, Lionel, Alona, Max]

        //4.How to print Array and ArrayList
        System.out.println(Arrays.toString(namesArray));//[Abe, null, null, null, null]
        System.out.println(namesList);//[James, Abe, John, Lionel, Alona, Max]

        namesList.add("Andrei");
        System.out.println(namesList);//[James, Abe, John, Lionel, Abe, Alona, Max, Andrei]

        namesList.add(5,"Taylor");
        System.out.println(namesList);//[James, Abe, John, Lionel, Abe, Taylor, Alona, Max, Andrei]

        namesList.set(3, "Daria");
        System.out.println(namesList);//[James, Abe, John, Daria, Abe, Taylor, Alona, Max, Andrei]

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("null");
        namesList.add("null");
        namesList.add("null");
        namesList.add("Guluzar");
        System.out.println(namesList);

        //How to remove element from ArrayList
        //namesList.remove(7) this remove element at index of 7
        //namesList.remove("James") this willremove James
        //namesList.removeAll(collectionOfElementsToBeRemoved) this will rwmove all the element of given collection

        namesList.remove(0);
        System.out.println(namesList);//[Abe, John, Daria, Abe, Taylor, Alona, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove(2));//Daria
        System.out.println(namesList);//[Abe, John, Abe, Taylor, Alona, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        namesList.remove("Alona");
        System.out.println(namesList);//[Abe, John, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove("John"));//true
        System.out.println(namesList);//[Abe, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove("max"));//false
        System.out.println(namesList);//[Abe, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        namesList.remove("Regina");
        System.out.println(namesList);//[Abe, Abe, Taylor, Max, Andrei, Regina, Regina, null, null, null, Guluzar]

        namesList.add(0,"Regina");
        System.out.println(namesList);

        namesList.remove("Regina");
        System.out.println(namesList);

        //how to get an element from Array and Array List

        System.out.println(namesArray[2]);


        System.out.println(namesList.get(3));//Max
        System.out.println(namesList.get(5));//Regina

        namesList.indexOf("Regina");
        System.out.println(namesList.indexOf("Regina"));//5
        System.out.println(namesList.lastIndexOf("Regina"));//6

        System.out.println(namesList.contains("Kaly"));//false
        System.out.println(namesList.isEmpty());// false
        namesList.clear();
        System.out.println(namesList);//0

    }
}
