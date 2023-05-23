// Author: Kartik Kathuria
// Topic: Java Basics
// Time and Date: 7:04 and 23/05/23

public class SecondClass {
    public static void main(String[] args) {
        // 1. Java Syntax and Output
        // Definition Class - Class without Main Method
        // Execution Class - Class has a main method
        
        // Access Specifiers - Public, Private and Protected

        System.out.println("Hello World"); // Presenting Output

        // println() -> want to print the thing in the next line
        // print() -> want to print the thing in the same line

        System.out.print("Anna");
        System.out.println("How r u?");

        // 2. Java Comments
            // Comments are used to explain the code
            // Comments meke the code more readable
        // There are two types of comments in Java
            // Single Line Comments - // (Ctrl + /)
            // Multi Line Comments - /* */
        /*Hello
         * Anna How
         * are 
         * you?
         */

        //  3. Variables 
        // Variables are containers (memory location) for storing data values
        // 1. String - text such as "Hello"
        // 2. int - integers
        // 3. float - decimals
        // 4. char - character
        // 5. boolean - true/false

        // How to create a variable (syntax)
        // type variableName = value;
        // type -> Type of data that we are storing inside containers
        // variableName - var name that depends on us
        // = -> Assignment Operator
        // value -> Thing that we are storing inside variable (container)
        // ; -> Line Terminator
        
        // Variable of String
        String name = "Anna"; // Declaration and Initialisation
        System.out.println(name);

        // Variable of int
        int num = 7;
        System.out.println(num);

        // variable of float
        float myFloatNum = 4.567f;
        System.out.println(myFloatNum);
        
        // Variable of character
        char ch = 'A';
        System.out.println(ch);

        // Variable of boolean 
        boolean bol = true;
        System.out.println(bol);

        // Declare and Initialise Multiple Variables
        // Simple Way
        int x = 5;
        int y = 6;
        int z = 7;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Single line way
        int p=5, q=6, r=7;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
