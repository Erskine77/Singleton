package org.erskineespaderos.sistema;

import org.erskineespaderos.bean.Singleton;
import org.erskineespaderos.view.Ventana;
public class Principal {
    public static void main(String args[]){
        /*Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        Singleton s3 = Singleton.getInstancia();
        Singleton s4 = Singleton.getInstancia();
        System.out.println("Instancia: " + s1);
        System.out.println("Instancia: " + s2);
        System.out.println("Instancia: " + s3);
        System.out.println("Instancia: " + s4);*/
        
        //Interface
        Ventana miVentana = new Ventana();
    }
}
