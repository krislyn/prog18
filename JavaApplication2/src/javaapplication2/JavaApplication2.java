/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 * Esimene katsetus. Muutujad, valik, massiiv
 * @author if17
 */
public class JavaApplication2 {

    
    public static void ilmaKommentaar(){
        int temperatuur =-2;
        if(temperatuur>0){System.out.println("Sulab");}
        else{System.out.println("Jäätab");}
    }
    /**
     * Programmi töö algus koht
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmaKommentaar();
    
    }
    
}
