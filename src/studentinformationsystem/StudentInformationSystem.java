/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author adila
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Student Information System");
        System.out.println("Student Name: Nur Adila Farahiyah Binti Ainuddin");
        System.out.println("Student ID: S87674");
        
        int mark1 = 45;
        int mark2 = 48;

        // Calculate the total mark
        int totalMark = mark1 + mark2;

        // Display the marks and total
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + totalMark);
        System.out.println("Percentage: " + totalMark + "%");
        
        // Display a result message
        if (totalMark >= 80) {
            System.out.println("Result: Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
    

