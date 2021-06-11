package com.company;

public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    //İki tip bağımlılık vardır:
    //loosly - tightly coupled
    //Bu tip tightly bağımlılıkları loosly bağımlılık haline getirmeliyiz

    public void add(Customer customer) {
        System.out.println("Müşteri eklendi " + customer.getFirstName());
       // this.logger.log(customer.getFirstName());
        //DatabaseLogger databaseLogger = new DatabaseLogger();
       // databaseLogger.log(customer.getFirstName() + " veritabanına loglandı.");
//       for(Logger logger:loggers){
//          logger.log(customer.getFirstName());
//       }
        Utils.runLoggers(loggers, customer.getFirstName());//Static sınıflara nesne oluşturmadan ulaşabiliriz.
    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi " + customer.getFirstName());
       // this.logger.log(customer.getFirstName());
       // FileLogger fileLogger = new FileLogger();
        //fileLogger.log(customer.getFirstName() + "dosyadan silindi.");
//        for(Logger logger:loggers){
//            logger.log(customer.getFirstName());
//        }
        Utils.runLoggers(loggers,customer.getFirstName());

    }
}
