package com.company;

public class Main {

    public static void main(String[] args) {
// Let's Test what you have learned about Operators.

        // 1. Create a double variable with a value of 20.00
        double myDouble = 20.00d;

        // 2. Create a second variable of type double with the value 80.00
        double myOtherDouble = 80.00d;

        // 3. Add both numbers together and multiply by 100.00.
        double doubleTrouble = (myDouble+myOtherDouble) * 100d;
        System.out.println("Total value = " + doubleTrouble);

        // 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
        double troubleRemainder = (doubleTrouble % 40.00d);
        System.out.println("Remainder Value = " + troubleRemainder);

        // 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero
        boolean whatsLeft =  (troubleRemainder == 0) ? true : false;
        // 6. Output the boolean variable.
        System.out.println("There is no remainder = " + whatsLeft);

        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (whatsLeft = false) {
            System.out.println("Got some remainder");
        }
    }
}
