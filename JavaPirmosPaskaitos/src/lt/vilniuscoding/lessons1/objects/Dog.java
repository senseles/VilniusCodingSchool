package lt.vilniuscoding.lessons1.objects;

public class Dog extends Animal {
    public Dog(){
        setName("Dog");
    }

    @Override
    protected String getVoice(){
        return "Au";
    }
}
