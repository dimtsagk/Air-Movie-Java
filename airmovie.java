// Dimitris K. Tsagkaris. Movie coding assignment.
// JDK version 17

import java.util.Scanner; // Imports scanner class from the java library.

public class airmovie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


           // User enters the duration of 6 movies in minutes, using array list.

        int[] movieduration = new int[7];   // Using number 7 in arrays, because Java starts from 0. For convenience, we start from 1.
        System.out.println("Enter the duration of 6 movies: ");


           // This statement prints all the movies duration.

        for (int i = 1; i < 7; i++) {   // Counting movies from 1 to 6.
            System.out.print("Duration of movie " + (i) + ": ");
            movieduration[i] = movielimit(scanner, 2, 1000);  // Here we limit the numbers the user can enter.
        }

     
            // User enters the flight duration in minutes.

        int flightduration;
        System.out.print("Enter the flight duration: ");

        
           // Setting the minimum flight duration at 60 minutes and max at 1500 (it isn't required, but usually flights are not that long). 

        flightduration = flightlimit(scanner, 60, 1500);  


           // This statement compares the duration of the movies and the flight.

        System.out.print("The movies you can watch are: ");        
        for (int i = 1; i < movieduration.length; i++) {


              // Checking if the movie is shorter or equal to the flight duration, minus 30 minutes.

            if (movieduration[i] <= flightduration -30) {   
                System.out.print("[" + (i) + "]" + " ");
                
            }

        }
                              
           // Closing the scanner to save resources       

        scanner.close();   
    }
    
        // Private method, where we set the duration limit for the movies. 

    private static int movielimit(Scanner scanner, int min, int max) {
        int movielength;
           
        do {
            while (!scanner.hasNextInt()) {    // Checking if the user gives an int number before continuing.
                scanner.next();    
            }

            // Checking if the movie length is in range. When it's less than min or more than max, it prints a message to the user.

        movielength = scanner.nextInt();   
            if (movielength < min || movielength > max) {    
                System.out.println("Movie length must be between " + min + " and " + max + ". Try again: ");
            }
        }
         while (movielength < min || movielength > max);   // Keeps the app running, when the user gives out of range numbers.
        
        return movielength; // Ending this method. Returning back to main class.
    }


       // Private method, where we set the duration limit for the flight.

    private static int flightlimit(Scanner scanner, int min, int max) {
        int flightlength;

        do {
            while (!scanner.hasNextInt()) {   // Checking if the user gives an int number before continuing.
                scanner.next(); 
            }

            // Checking if the flight length is in range.

        flightlength = scanner.nextInt();
            if (flightlength < min || flightlength > max) {
                System.out.println("Flight length must be between " + min + " and " + max + ". Try again: ");
            }
        }

         while (flightlength < min || flightlength > max);   // Keeps the app running, when the user gives out of range numbers.
        
        return flightlength;   // Ending this method. Returning back to main class.

    }
    

}

    

    




