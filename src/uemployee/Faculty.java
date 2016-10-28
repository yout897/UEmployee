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
public class Faculty extends UEmployee{
    
    String department;
    
    public void department(String depart){
        department = depart;
    }
    
    @Override
    public String toString(){
        return ("Name: " + name + "\nSalary: " + salary + "\nDapartment: " + department);
    }
}
