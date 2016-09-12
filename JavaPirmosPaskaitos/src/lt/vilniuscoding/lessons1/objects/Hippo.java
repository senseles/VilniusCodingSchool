package lt.vilniuscoding.lessons1.objects;

public class Hippo extends Animal {

    public Hippo(){
        setName("Hippo");
    }

    /*
    *
    * Overriding parent's public method
    *
    * */
    @Override
    public String makeNoise(){
        return "Blurb";
    }
}
