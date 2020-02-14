/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author oghenemaigaelebe
 */
public class mySalary {
    
    public double calcHourlyWage (int Salary){
        double hourlyWage = Salary/(2080);
        System.out.println("With an hourly wage of " + String.format("%.2f",+ 
                hourlyWage));
        return hourlyWage;
    }
    
    
    public double calcSalary (int hourlyWage){
        
        int totalSalary = hourlyWage * (40 * 52);
        int yearlyBonus = totalSalary * (15/100); //Bonuses are 15% of salary
        int yearlyTotal = yearlyBonus + totalSalary;
        System.out.println("Total Salary = " + (int)yearlyTotal);
        return yearlyTotal;
        
    }
    
    public double calctaxes (int salary,double perc){
        double yearlyTax = salary * 0.07;
        System.out.println("Tax rate of $" + String.format("%.2f",yearlyTax) + 
                ",at a Rate of 7%");
        return yearlyTax;
    }
    
    public double afterTax (int salary, double perc){
        double yearlyTax = salary * 0.07;
        double netPay = salary - yearlyTax;
        System.out.println("Netpay for the year = $" + netPay);
        return netPay;
    }
    
    
}