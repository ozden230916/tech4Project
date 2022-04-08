package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){
        String s1 = "Tech";
        String s2 = "Global";

        String schoolName1 = s1 + s2; // + operator
        String schoolName2 = s1.concat(s2); // concat method

        System.out.println(schoolName1);
        System.out.println(schoolName2);

        String myName = "Salih";
        String myLastName = "Aydin";

        String fullName1 = "Salih Aydin";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName.concat(" ".concat(myLastName));

        System.out.println("This is fullName1 --->" + fullName1);
        System.out.println("This is fullName2 --->" + fullName2);
        System.out.println("This is fullName3 --->" + fullName3);




    }
}
