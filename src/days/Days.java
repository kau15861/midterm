/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 * harmanpreetkaur
 jn 22nd
 */
public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7):");
        int code = in.nextInt();

        Weekdays t = new Weekdays();
        t.nameOfDay(code);
        
        System.out.println("All Days:");
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day.name() + ": " + day.getDayName());
        }
    }
}
