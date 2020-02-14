/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mySalary get = new mySalary();
        get.calcHourlyWage(75000);
        get.calcSalary(36);
        get.calctaxes(75000,0.07);
        get.afterTax(75000, 36.06);
        
        
    }
    
}
