package com.company;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle veritabanına eklendi");
    }
}
