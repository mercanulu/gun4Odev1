package com.company;

public abstract class GameCalculator {
    public abstract void hesapla();//extend eden her sınıfın override etmesi gerekir.
    public final void gameOver(){//override edilmesini istemiyorsak
        System.out.println("Oyun bitti");
    }
    //abstract sınıflar new'lenemez
}
