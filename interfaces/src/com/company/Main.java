package com.company;

public class Main {

    public static void main(String[] args) {

        Logger[] loggers={new SmsLogger(),new EmailLogger(),new DatabaseLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer=new Customer(1,"Mercan","Ulu");
        customerManager.add(customer);
        System.out.println("------------------");
        customerManager.delete(customer);

    }
}
