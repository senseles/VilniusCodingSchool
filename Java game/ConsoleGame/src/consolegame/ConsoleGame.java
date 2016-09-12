
package consolegame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ConsoleGame {

    public static Random rand = new Random();
    public static Scanner key = new Scanner(System.in);
    public static int[] duomenys = {0, 0, 0, 0, 0, 0};
    public static boolean game_over = false;

    public static void draw() {
        for (int i = 0; i < 25; i++) //Išvalom ekraną
        {
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < (duomenys[i] - 1) / 10; j++) {
                System.out.print("-");
            }
            System.out.print(i);
            for (int j = 0; j < 10 - ((duomenys[i] - 1) / 10); j++) {
                System.out.print("-");
            }
            if (duomenys[i] <= 110) {
                System.out.println("|-");
            } else {
                game_over = true;
                duomenys[5] = i;
                System.out.println("-");
            }
        }
    }

    public static void roll() throws InterruptedException {
        Thread.currentThread().sleep(500);
        for (int i = 1; i <= 4; i++) {
            duomenys[i] = duomenys[i] + (rand.nextInt(6) + 1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Statykite už bėgiką: 1,2,3,4");
        duomenys[0] = key.nextInt();
        while (!game_over) {
            draw();
            roll();
        }
        System.out.println("Laimėjo " + duomenys[5] + " bėgikas!");
        if (duomenys[0] == duomenys[5]) {
            System.out.println("Jūs išlošėte!");
        } else {
            System.out.println("Jūs pralošėte");
        }
    }
}
