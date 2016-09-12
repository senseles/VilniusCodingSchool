package lt.vilniuscoding.lessons1.objects;

public class Giraffe extends Animal {

    public Giraffe(){
        setName("Giraffe");
    }

    @Override
    protected String getVoice(){
        return "Slurpt";
    }
}
