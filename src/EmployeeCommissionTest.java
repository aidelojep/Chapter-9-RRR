public class EmployeeCommissionTest {
    public static void main(String[] args) {
        EmployeeCommission commission = new EmployeeCommission("Peter","Aideloje",
                "222-120-401-5987",5000, .6);
        System.out.println("Employee informations obtained from get methods below:");

        System.out.printf("%n%s %s%n", "FirstName of employee is:", commission.getFirstName());
        System.out.printf("%n%s %s%n", "LastName of employee is:", commission.getLastName());
        System.out.printf("%n%s %s%n", "SecurityNumber is:", commission.getSecurityNumber());
        System.out.printf("%n%s %s%n", "grossSales is:", commission.getGrossSales());
        System.out.printf("%n%s %s%n", "commissionSales is:", commission.getCommissionSales());

             commission.setCommissionSales(0.9);
             commission.setGrossSales(5000);
        System.out.printf("%s%n: %n%n%s%n", "Updated employee information is :", commission);



    }
}
