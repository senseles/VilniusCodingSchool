/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Daniel
 */
public class Test1 {

    Test1() {
        System.out.print("Sukureme konstruktoriu");  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kalbek();
        new Test1();
        kalbek3();
     
    }
    public void kalbek3(){
       System.out.print("Sveikas pasauli");
    }

    public static void kalbek() {
        System.out.print("Sveikas pasauli");
    }

    public void kalbek2() {
        System.out.print("Sveikas pasauli");
    }
    
    
}
