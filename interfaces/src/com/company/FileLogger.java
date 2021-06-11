package com.company;

public class FileLogger implements Logger {
    //Java da implement edilen metot otomatik olarak override edilir.
    @Override
    public void log(String message) {
        System.out.println("Dosya loglandı : "+message);
    }
}
