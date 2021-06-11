package com.company;

import java.sql.DatabaseMetaData;

public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager=new CustomerManager();
	//customerManager.baseDatabaseManager=new OracleDatabaseManager();
	customerManager.baseDatabaseManager=new MySqlDatabaseManager();
	customerManager.getCustomers();
    }
}
