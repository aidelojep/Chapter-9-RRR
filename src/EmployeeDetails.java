public class EmployeeDetails extends Object {
    private final String firstName;
    private final String lastName;
    private final String securityNumber;
    private double grossSales;
    private double commissionSales;

public EmployeeDetails(String firstName,String lastName,String securityNumber,double grossSales,double commissionSales){
    if (grossSales < 0.0)
        throw new IllegalArgumentException("Gross sales cannot be lessed than zero");
    if (commissionSales < 0.0 || commissionSales >= 1.0)
        throw new IllegalArgumentException("commissionSales cannot be lessed than zero or greater than one");

    this.firstName=firstName;
    this.lastName=lastName;
    this.securityNumber=securityNumber;
    this.grossSales=grossSales;
    this.commissionSales=commissionSales;

}
public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}
public String getSecurityNumber(){
    return securityNumber;
}
public void setGrossSales(double grossSales){
    if (grossSales < 0.0) {
        throw new IllegalArgumentException("Gross Sales cannot be lessed than zero");
    }
    this.grossSales=grossSales;
}
public double getGrossSales(){
    return  grossSales;
}
public void setCommissionSales (double commissionSales){
    if (commissionSales < 0.0 || commissionSales >= 1.0) {
        throw new IllegalArgumentException("commissionSales cannot be lessed than zero or greater than one");
    }
    this.commissionSales=commissionSales;
}
public double getCommissionSales(){
   return commissionSales;
}
public double earnings(){
    return grossSales * commissionSales;
}
public String toString(){
    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n", "employeeDetails", firstName, lastName,
            "Social Security Details", securityNumber, "grossSales",grossSales,"commissionSales",commissionSales);
}




}
