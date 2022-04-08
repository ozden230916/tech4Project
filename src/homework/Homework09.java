package homework;
import utilities.ScannerHelper;
public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------\n");

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        if (name.length() >= 3){
            System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
            System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        }
        else{
            System.out.println("The first 3 characters in the name are = " + name);
            System.out.println("The last 3 characters in the name are = " + name);
        }
        System.out.println((name.toLowerCase().startsWith("a")) ? "You are in the club!" : "Sorry, you are not in the club");

        System.out.println("\n--------TASK-2--------\n");

        String address = ScannerHelper.getAStringFromUser();// Please enter your address

        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("\n--------TASK-3--------\n");

        String colors = ScannerHelper.getAStringFromUser();// Please enter at least 4 color

        if (colors.toLowerCase().contains("green") && colors.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if (colors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if (colors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("\n--------TASK-4--------\n");

        String str = "   Java is FUN   ";
        String newStr = str.trim().toLowerCase();

        System.out.println("The first word in the str is = " + newStr.substring(0, newStr.indexOf(' ')));
        System.out.println("The second word in the str is = " + newStr.substring(newStr.indexOf(' ') + 1, newStr.lastIndexOf(' ')));
        System.out.println("The third word in the str is = " + newStr.substring(newStr.lastIndexOf(' ') + 1));

    }
}
