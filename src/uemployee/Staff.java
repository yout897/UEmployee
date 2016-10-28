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
public class Staff extends UEmployee{
    
    String title;
    
    public void title(String tile){
        title = tile;
    }
    public String toString(){
        return ("Name: " + name + "\nSalary: " + salary + "\nJob Title: " + title);
    }
}
