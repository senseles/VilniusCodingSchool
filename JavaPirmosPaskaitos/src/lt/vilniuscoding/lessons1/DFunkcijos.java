package lt.vilniuscoding.lessons1;

import java.util.Scanner;

public class DFunkcijos {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("Sveiki atvyke i VCS!!!");
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("Iveskite skaiciu: ");
        int a = input.nextInt();
        /*
        * Calling function:
        *
        * [identifier]([variables]);
        *
        * */
        printUpTo(a);
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>();

        int fact = fact(a);
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("Skaiciaus " + a + " faktorialas = " + fact);
    }

    /*
    *
    * Functions:
    *
    * [modifier] [return type] [identifier] ([parameters]){
    *   [body]
    * }
    * */
    private static int fact(int a) {
        if (a == 0){
            return 1;
        } else {
            return a*fact(a-1);
        }

    }

    private static void printUpTo(int a) {
        for (int i = 0; i < a; i++){
            System.out.print(i + " ");
        }
    }
}
