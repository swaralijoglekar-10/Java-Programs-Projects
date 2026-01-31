package com.swarali.OOP_GroupStudy;

class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Swarali", 500000.45, "joglesar@schaeffler.com");
        System.out.println("Inside default constructor");
    }
    public Customer(String name, String email){
        this(name, 4580000.56, email);
        System.out.println("Inside constructor with 2 params");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Inside constructor with all params");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getName()+" "
        + customer1.getCreditLimit()+" "+ customer1.emailAddress);

        Customer customer2 = new Customer("Sanika", "sanika@gmail.com");
        System.out.println(customer2.getName()+" "
                + customer2.getCreditLimit()+" "+ customer2.emailAddress);

        Customer customer3 = new Customer("Aditi", 567000.34, "aditi@gmail.com");
        System.out.println(customer3.getName()+" "
                + customer3.getCreditLimit()+" "+ customer3.emailAddress);

    }

}
