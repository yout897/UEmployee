

package uemployee;

/**
 *
 * @author aldic2547
 */
public class UEmployee {
    String name;
    int salary;
    
    public void name(String nm){
        name = nm;
    }
    public void salary(int sal){
        salary = sal;
    }
    @Override
    public String toString(){
        return ("Name: " + name + "\nSalary: " + salary);
    }
}
