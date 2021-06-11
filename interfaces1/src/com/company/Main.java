package com.company;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());//polimorfizm
        //customerManager.customerDal = new OracleCustomerDal();

        customerManager.add();
    }
}
