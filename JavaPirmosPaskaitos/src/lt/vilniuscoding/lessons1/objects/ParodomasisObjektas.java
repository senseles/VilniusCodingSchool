package lt.vilniuscoding.lessons1.objects;

public class ParodomasisObjektas {

    public int publicA;
    private int privateB;

    /*
    *
    * Objekto konstruktorius:
    * Object constructor:
    *
    * [modifier] [class name]([parameters]){
    *   [body]
    * }
    *
    * Overloading works. You can have multiple constructors with different parameters.
    * Can be omitted, then default constructor is generated automatically.
    * Default constructor has no parameters and is empty.
    * */

    public ParodomasisObjektas(){
        publicA = 20;
        privateB = 80;
    }

    public ParodomasisObjektas(int publicA, int privateB){

        /*
        *
        * Keyword "this" is used to point to current object. The one object you are currently using.
        *
        * */
        this.publicA = publicA;
        this.privateB = privateB;
    }


    public int getPrivateB() {
        return privateB;
    }

    public void setPrivateB(int privateB) {
        this.privateB = privateB;
    }


    public void printSelf(){
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>(this);
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("publicA = " + publicA);
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2305.840119306592!2d25.275911215400235!3d54.69484108055067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dd940472bbfdcd%3A0x6aacb2bb753c2a02!2sKonstitucijos+pr.+12%2C+Vilnius+09309!5e0!3m2!1slt!2slt!4v1459844325267" width="540" height="260" frameborder="0" style="border:0" allowfullscreen></iframe>("privateB = " + getPrivateB());
    }


}
