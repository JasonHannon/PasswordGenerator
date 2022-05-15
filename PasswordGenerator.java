import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        
      String numbers = "123456789"; //Create string of numbers
      String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Create string of letters
      String password = ""; //Create variable to store each randomly generated password
      
      int input = 0, num_count = 0, char_count = 0, array_count = 0; //
      
      Random rand = new Random(); //Random object to generate random numbers and letters
      
      Scanner get_input = new Scanner(System.in); //Scanner class to get user input
      input = get_input.nextInt(); //Read user input and assign it to input variable
      
      String[] password_array = new String[input]; //Create an array of strings
      
      for (int i = 0; i < input; i++) //Loop to create as many passwords that user asked for
      {
          for (int j = 0; j < 7; j++) //Loop to create the password
          {
              if (num_count < 4) //Create numbers
              {
                  password += numbers.charAt(rand.nextInt(numbers.length()));
                  num_count++;
              }
              
              else //Create letters
              {
                  password += letters.charAt(rand.nextInt(letters.length()));
                  char_count++;
              }
          }
          
          password_array[array_count] = password; //Insert generated password into the array
          array_count++; //Array counter to add the next password into the next array position
          num_count = 0; //Reset num_count
          password = ""; //Reset password
      }

      System.out.println(Arrays.toString(password_array)); //Output array of passwords
    }
}