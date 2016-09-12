package lt.vilniuscoding.lessons1;

public class EMasyvai {

    public static void main(String[] args) {
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("Sveiki atvyke i VCS!!!");

        /*
        *
        * Masyvas
        * Array
        *
        * [type][] [identifier] = new [type][array size]
        *
        * Masyvo elemento pasiekimas:
        * Using array element:
        *
        * [identifier][array element number/address]
        * */
        int[] masyvas = new int[10];

        for (int i = 0; i < 10; i++){
            masyvas[i] = i;
        }

        System.out.print("Masyvas = {");
        for (int i = 0; i < 10; i++){
            System.out.print(" " + masyvas[i]);
        }
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("}");
    }


}
