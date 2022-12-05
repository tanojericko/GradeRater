/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity3.pkg1;
import java.util.Scanner;
/**
 *
 * @author Jericko James Tano
 */
public class Activity31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter Student's grade: ");
        double sdgrade = myScan.nextDouble();

        if (sdgrade >= 1.00 && sdgrade <= 3.00) {
            System.out.println("Passed");
            
            if (sdgrade >= 1.00 && sdgrade <= 1.25) {
                System.out.println("Suma Cum Laude");

            } else if (sdgrade >= 1.26 && sdgrade <= 1.50) {
                System.out.println("Magna Cum Laude");

            } else if (sdgrade >= 1.51 && sdgrade <= 1.75) {
                System.out.println("Cum Laude");

            } else if (sdgrade >= 1.76 && sdgrade <= 3.00) {
                System.out.println("Without Honors");

            }

        } else if (sdgrade >= 3.01 && sdgrade <= 5.00) {
            System.out.print("Failed");

        } else {
            System.out.println("Out of Range");
        }
            
        
    myScan.close();     
    }
    
}
