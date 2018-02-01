/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Arrays;
public class massiivid {
    
    
    
    public static int summa(int[] arvud){
        int summa=0;
        for(int i=0; i<arvud.length; i++){
            summa+=arvud[i];
    }
     return summa;   
    }
    public static double keskmine(int[] arvud){
        return summa(arvud)*1.0/arvud.length;
    }
    
    
    //Koosta funktsioon, mis tagastab kaheelemendilise massivi,
    //mille esimeseks elemendiks on etteantud arvudest suurim ning
    //teiseks vähim

    /**
     *
     * @param arvud
     * @return
     */
    
    public static int[] piirid(int[] arvud){
        int[] vastus=new int[2];
        if(arvud==null){
            throw new RuntimeException("Parameetri väärtus null");
        }
        if(arvud.length==0){
            throw new RuntimeException("Parameetriks tühi massiiv");
        }
        vastus[0]=vastus[1]=arvud[0]; //esimese arvu omistab vastuse mõlemale
        for(int arv:arvud){
            if(arv<vastus[0]){vastus[0]=arv;}
            if(arv<vastus[1]){vastus[1]=arv;}
        }
        
        
        return vastus;
    }
    
    public static void main(String[] arg){
        int[] pikkused={176, 163, 158, 171, 169};
        int[] t=piirid(pikkused);
        System.out.println(t[0]+" "+t[1]);
        System.out.println(summa(pikkused));
        System.out.println(keskmine(pikkused));
        System.out.println("Kokku: "+pikkused.length);
        System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
        for(int i=0; i<pikkused.length; i++){
            System.out.println(pikkused[i]);
        }
        //Arvuta pikkuste summa
        int summa=0;
        for(int i=0; i<pikkused.length; i++){
            summa+=pikkused[i];
        }
        System.out.println(summa);
        summa=0;
        for(int pikkus: pikkused){summa+=pikkus;}
        System.out.println(summa);
        System.out.println(Arrays.stream(pikkused).sum());}
}


/*
158 158
837
167.4
Kokku: 5
176 169
176
163
158
171
169
837
837
837
*/