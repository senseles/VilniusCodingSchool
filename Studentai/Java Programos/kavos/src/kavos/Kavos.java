/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kavos;

import java.io.*;

/**
 *
 * @author Daniel
 */
public class Kavos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       System.out.print("Įveskite savo vardą: ");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String vardas = br.readLine();
       System.out.println("Sveiki, pone "+vardas);
       while(true)
       {
           System.out.println("Kuo galėčiau padėti?");
           System.out.println("1)Išvirti kavos");
           System.out.println("2)Suskaičiuoti nuolaidą");
           System.out.println("3)Nieko nedaryti");
           menu(Integer.parseInt(br.readLine()));
       }
    }
    private static void menu(int pasirinkimas) throws IOException
    {
        
        switch(pasirinkimas)
        {
            case 1:
                System.out.println("mmmm... Kava");
                break;
            case 2:
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int kaina;
                float nuolaida;
                System.out.print("Įveskite kainą: ");
                kaina = Integer.parseInt(br.readLine());
                System.out.println("Įveskite nuolaidą: ");
                nuolaida = Integer.parseInt(br.readLine());
                kaina = (int) (kaina-(kaina*(nuolaida/100)));
                System.out.println("Kaina: "+kaina);
                break;
            case 3:
                System.out.println("Jei jau toks nereikalingas tai... išeinu!");
                System.exit(0);
                break;
            default:
                System.out.println("Atsiprašau, bet to daryt nemoku");
                break;
        }
    }
}
