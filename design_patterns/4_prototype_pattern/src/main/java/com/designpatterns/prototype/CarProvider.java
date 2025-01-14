package com.designpatterns.prototype;

// Make this class singleton
public class CarProvider {

    private Innova innova;
    private Kylaq kylaq;

    public CarProvider(){
        this.innova = new Innova("Innova HyCross");
        this.kylaq = new Kylaq("Kylaq Signature");
    }

    public Car getInnova() throws CloneNotSupportedException {
        return innova.clone();
    }

    public Car getKylaq() throws CloneNotSupportedException {
        return kylaq.clone();
    }

}
