package org.erskineespaderos.bean;

public class Singleton {
    private static Singleton instancia;
    
    private Singleton(){
        
    }

    public Singleton(Singleton instancia) {
        this.instancia = instancia;
    }
    
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    //Singleton S1 = Singleton.getInstancia();
    //Singleton S2 = Singleton.getInstancia();
}
