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
    
    /**
     *  * Alamprogramm toa soojuse hindamiseks vastavalt temperatuurile
     * vähemalt kolm taset
     */

    
    public static void toaSoojus(){
        int temperatuur =23;
        if(temperatuur>23){System.out.println("Soe");}
            if(temperatuur>20){System.out.println("Paras");}
        else{System.out.println("Külm");}
    }
    /**
     * Programmi töö algus koht
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, web!");
        toaSoojus();
    }
    
}
