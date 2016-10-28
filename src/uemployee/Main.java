/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployee;

/**
 *
 * @author aldic2547
 */
public class Main {
    
    public static void main(String args[]){
        UEmployee george = new UEmployee();
        Faculty bob = new Faculty();
        Staff marry = new Staff();
        
        george.name("George");
        george.salary(25000);
        
        bob.name("Bob");
        bob.salary(23000);
        bob.department("Teaching");
        
        marry.name("Marry");
        marry.salary(28000);
        marry.title("Principle");
        
        System.out.println(""+george.toString());
        System.out.println("\n"+bob.toString());
        System.out.println("\n"+marry.toString());
    }
    
}
