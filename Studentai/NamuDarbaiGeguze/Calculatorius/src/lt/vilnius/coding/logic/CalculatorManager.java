/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.logic;

import lt.vilnius.coding.abstracts.CalculatorInterface;
import lt.vilnius.coding.abstracts.SimbolEntity;

/**
 *
 * @author Daniel
 */
public class CalculatorManager implements CalculatorInterface {

    public int count(int skac, int skac2, String veiks) {
        int rezultatas = 0;
        switch (veiks) {
            case "+":
                System.out.println(skac + skac2);
                rezultatas = skac + skac2;
                break;
            case "-":
                System.out.println(skac - skac2);
                rezultatas = skac + skac2;
                break;
            case "/":
                System.out.println(skac / skac2);
                rezultatas = skac + skac2;
                break;
            default:
                System.out.println("Blogas veiksmas");
                break;
        }

        return rezultatas;
    }

    public int count(SimbolEntity se) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int rezultatas = 0;
        switch (se.getVeiksmas()) {
            case "+":
                System.out.println(se.getSkaicius1() + se.getSkaicius2());
                rezultatas = se.getSkaicius1() + se.getSkaicius2();
                break;
            case "-":
                System.out.println(skac - skac2);
                rezultatas = skac + skac2;
                break;
            case "/":
                System.out.println(skac / skac2);
                rezultatas = skac + skac2;
                break;
            default:
                System.out.println("Blogas veiksmas");
                break;
        }

        return rezultatas;

    }

}
