package lt.vilniuscoding.lessons1.objects;

public class Animal {

    private String name = "Animal";

    public String makeNoise(){
        return name + " says " + getVoice();
    }

    protected String getVoice() {
        return "ZZZZ";
    }

    protected void setName(String name) {
        this.name = name;
    }
}
