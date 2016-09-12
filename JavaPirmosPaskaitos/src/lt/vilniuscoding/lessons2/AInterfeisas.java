package lt.vilniuscoding.lessons2;

import lt.vilniuscoding.lessons2.interfaces.Boy;
import lt.vilniuscoding.lessons2.interfaces.Girl;
import lt.vilniuscoding.lessons2.interfaces.Screaming;

public class AInterfeisas {

    public static void main(String[] args){
        Screaming one = new Boy();
        Screaming two = new Girl();

        one.scream();
        two.scream();

        //one.boyishStuff();
        //two.girlishStuff();
    }
}
