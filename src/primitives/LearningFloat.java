package primitives;

public class LearningFloat {
    public static void main(String[] args){
        float myFirstFloat = 14.5F;
        float mySecondFloat = 45.2F;
        float myThirdFloat = 56.2435556F;
        float maxFloat = 3.4028235E38F;
        float minFloat = 1.4E-45F;

        System.out.println(myFirstFloat);// 14.5
        System.out.println(mySecondFloat);//45.2
        System.out.println(myThirdFloat);// 56.243557(rounded value of 56.2435556F.Float numbers can take only 6 character after dat)
        System.out.println(maxFloat);// 3.4028235E38F(max value of float)
        System.out.println(minFloat);//1.4E-45 (min value of float)
    }
}
