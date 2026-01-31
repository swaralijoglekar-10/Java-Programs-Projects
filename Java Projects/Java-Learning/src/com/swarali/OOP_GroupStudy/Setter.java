package com.swarali.OOP_GroupStudy;

 class Account {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  void depositFund(double amountToAdd){
        if(amountToAdd>0)
        this.accountBalance = this.accountBalance+amountToAdd;
    }
   public void withDrawFund(double withdrawalAmount){
        //withdrawal amount should be lesser than account balance
        if(withdrawalAmount>0 && withdrawalAmount<=this.accountBalance)
        this.accountBalance= this.accountBalance-withdrawalAmount;
   }

}

class Main{
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAccountNumber(1001);
        acc.setAccountBalance(10000);
        acc.setEmail("joglesar@schaeffler.com");
        acc.setCustomerName("Swarali");
        acc.setPhoneNumber(99999999999L);

        acc.depositFund(20000);
        System.out.println(acc.getAccountBalance()); //30000

        acc.withDrawFund(5000);
        System.out.println(acc.getAccountBalance()); //25000
    }
}
