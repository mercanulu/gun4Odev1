package com.company;

public class Utils {//her yerde tekrar edecek fonksiyonu bu şekilde yazarız

    public static void runLoggers(Logger[] loggers, String message) {
        for (Logger logger : loggers) {
            logger.log(message);
        }
       //Utils--Araçlar
        //Javada bir classı static yapamayız
        //Ancak classın içine class tanımlarsak o clası static yapabiliriz
        //Üst class static olamaz içerdeki class static olabilir(inner class)
    }
}
