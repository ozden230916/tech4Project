package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException{
        /*
        FIRST WAY OF HANDLE CATCH EXCEPTION USING TRY_CATCH BLOCK
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);//1 seconds
                System.out.println(i);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

         */
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);//1 seconds
            System.out.println(i);
        }
        Thread.sleep(3000);
        System.out.println("End of the program");
    }
}
