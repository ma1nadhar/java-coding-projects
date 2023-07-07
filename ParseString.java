/* 
 * ParseString.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program converts a String into an
 * Integer/Double datatype.
 * 
 */

public class ParseString {

    public static void main(String[] args) {

        String numberAsString = "2019.125";
        System.out.println("numberAsString = " + numberAsString);

        // parse String type into a Integer
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    }
    
}
