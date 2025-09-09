// RevStrWarmUp
// jg 9/9/25

public class RevStrWarmUP {
    public static void main(String[] args) {
      System.out.println("\n Welcome to my Reverse String Warm up program!");

      // Creat a program that reverses a string in a for loop
        //define this program in terms of input/processing/input

        //there is no input in this program everything is hard coded
        //processing is: decrementing a for loop, finding the length of the string
        // create a new string
        // with the end characters at the end of the string

        // create a couple of string variables and initialize myStr
        String myStr = "abcdefjhijk";
        String myRevStr = "";

        // Creat a for loop and use it to get each char from the str and use it
        // I know how to decrement a for loop

        int strLenght = myStr.length();

        System.out.println("\n strLength is " + strLenght);
        System.out.println("\n char at index 11 is " + myStr.charAt(10));

        for (int i=(strLenght-1); i>=0; i--) {
            System.out.println("\n the char at " +i+ " is " + myStr.charAt(i));
            myRevStr = myRevStr + myStr.charAt(i);
        }


        System.out.println("\n myRevStr is " + myRevStr+ "\n\n");






    }
}