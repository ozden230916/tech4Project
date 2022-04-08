package projects;

public class Project01 {
    public static void main(String[] args) {

        System.out.println("\n--------TASK-1------\n");
         /*
    -Store your name in a String variable called name
    -Print the variable with a proper message
        */
        String myName = "Ozden";

        System.out.println("My name is " + myName);

        System.out.println("\n--------TASK-2------\n");
         /*
    -Create different char variables for each of your name letter and store them in
    separate variables as nameCharacter1, nameCharacter2 and so on.
    -Print variables with proper messages
        */
        char nameCharacter1 = 'O',nameCharacter2 = 'Z', nameCharacter3 = 'D',
                nameCharacter4 = 'E', nameCharacter5 = 'N';

        System.out.println("The first character of my name is = " + nameCharacter1 +
                         "\nThe second character of my name is = " + nameCharacter2 +
                         "\nThe third character of my name is = " + nameCharacter3 +
                         "\nThe fourth character of my name is = " + nameCharacter4 +
                         "\nThe fifth character of my name is = " + nameCharacter5);

        System.out.println("\n--------TASK-3------\n");
         /*
    -Create different String variables for to store info like myFavMovie, myFavSong,
    myFavCity, myFavActivity, myFavSnack.
    -Print variables with proper messages
        */
        String myFavoriteMovie = "Kingdom of Heaven", myFavoriteSong = "CawBella",
                myFavoriteCity = "Los Angeles", myFavoriteActivity = "Swimming",
                myFavoriteSnack = "Cookies";

        System.out.println("My favorite movie is = " + myFavoriteMovie);
        System.out.println("My favorite song is = " + myFavoriteSong);
        System.out.println("My favorite city is = " + myFavoriteCity);
        System.out.println("My favorite activity is = " + myFavoriteActivity);
        System.out.println("My favorite snack is = " + myFavoriteSnack);

        System.out.println("\n--------TASK-4------\n");
         /*
    -Create different int variables for to store info like myFavNumber,
    numberOfStatesIVisited, numberOfCountriesIVisited.
    -Print variables with proper messages
          */
        int myFavoriteNumber = 13, numberOfStatesIVisited = 5, numberOfCountriesIVisited = 4;

        System.out.println("My favorite number is = " + myFavoriteNumber +
                        "\nThe number of states I have visited is = " + numberOfStatesIVisited +
                        "\nThe number of countries I have visited = " + numberOfCountriesIVisited);


        System.out.println("\n--------TASK-5------\n");
         /*
    -Create a boolean called amIAtSchoolToday
    -Assign true to this variable if all you are at campus today
    -Assign false to this variable if you are joining online today
    -Print variable value with a proper message using println() method
          */
        boolean amIAtSchoolToday = false;

        System.out.println("I am at school today is = " + amIAtSchoolToday);

        System.out.println("\n--------TASK-6------\n");
         /*
    -Create a boolean called isWeatherNiceToday
    -Assign true to this variable if it is above 60F today
    -Assign false to this variable if it is below or equal to 60F today
    -Print variable value with a proper message using println() method
          */
        boolean isWeatherNiceToday = false;

        System.out.println("Weather is nice today = " + isWeatherNiceToday);

    }
}
