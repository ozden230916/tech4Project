package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {
        /*
        Unchecked exceptions are the ones you get when you run a program.
        This is also known as Runtime exception.(Unchecked exception = Runtime exception)
         */
        String name = "John";
        //How to handle the exception
        try {
            System.out.println(name.charAt(10));
            System.out.println("End of the program");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the program");

    }

}
