package lt.vilniuscoding.lessons1.objects;

public class Cat extends Animal {

    public Cat(){
        setName("Cat");
    }

    /*
    *
    * Overriding parent's  protected class method
    *
    * */
    @Override
    protected String getVoice(){
        return "Miau";
    }
}
