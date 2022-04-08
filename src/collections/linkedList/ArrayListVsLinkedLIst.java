package collections.linkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedLIst {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);//[10.5, 12.5, 13.3, 17.7]

        for (Double number : numbers) {
            System.out.println(number);
        }
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println("---------Some additional methods Of LinkedList------");
        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        System.out.println("----------------");
        System.out.println(numbers.poll());
        System.out.println(numbers);

        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

        System.out.println(numbers.pollLast());
        System.out.println(numbers);

        System.out.println("----------------");
        numbers.push(5.7);
        numbers.push(8.9);
        System.out.println(numbers);

        System.out.println("----------------");
        System.out.println(numbers.pop());
        System.out.println(numbers);


    }
}
