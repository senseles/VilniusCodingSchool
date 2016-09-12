package lt.vilniuscoding.lessons2;

import java.util.ArrayList;
import java.util.List;

public class BSarasas {

    public static void main(String[] args) {
        System.out.println("Sveiki atvyke i VCS!!!");

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        for(Integer i : list){
            System.out.print(" " + i);
        }

    }
}
