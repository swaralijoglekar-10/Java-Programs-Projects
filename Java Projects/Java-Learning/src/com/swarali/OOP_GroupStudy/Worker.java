package com.swarali.OOP_GroupStudy;

//public record Worker(String name, String birthDate,String endDate){
//
//
//    public int getAge(){
//
//    }
//    public double collectPay(){
//
//    }
//    public void terminate(String endDate){
//
//    }
//}

public class Worker{
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge(){
        return 23;
    }
    public double collectPay(){
        return 234567.678;
    }
    public void terminate(String endDate){
        System.out.println("Resignation date of worker is: "+endDate);
    }
}
 class Employee extends Worker{
    private long employeeId;
    private String hireDate;

     public Employee() {

     }

     public Employee(long employeeId, String hireDate) {
         this.employeeId = employeeId;
         this.hireDate = hireDate;
     }
     public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
         super(name, birthDate, endDate);
         this.employeeId = employeeId;
         this.hireDate = hireDate;
     }


     public long getEmployeeId() {
         return employeeId;
     }

     public String getHireDate() {
         return hireDate;
     }
 }

 class HourlyEmployee extends Employee{

     private double hourlyPayRate;
     public HourlyEmployee() {
     }

     public HourlyEmployee(double hourlyPayRate) {
         this.hourlyPayRate = hourlyPayRate;
     }

     public HourlyEmployee(long employeeId, String hireDate, double hourlyPayRate) {
         super(employeeId, hireDate);
         this.hourlyPayRate = hourlyPayRate;
     }

     public void getDoublePay(){
     }

     public static void main(String[] args) {
         HourlyEmployee hourlyEmployee= new HourlyEmployee(345698L, "23/09/2024", 3456.56);
         System.out.println("Age"+ hourlyEmployee.getAge()+" "+"Wages= "+hourlyEmployee.collectPay());

//         System.out.println(
//         hourlyEmployee.getAge()+" "+
//         hourlyEmployee.collectPay()+" "+
//         hourlyEmployee.terminate("23/09/2024")+" "+
//         hourlyEmployee.getDoublePay());
     }

 }


