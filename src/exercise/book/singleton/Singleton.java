package exercise.book.singleton;

public class Singleton {

    //Share Instance
    private static Singleton singleton = new Singleton();

    //Constructor
    private Singleton(){

    }

    //Getting Instance
    public static Singleton getInstance(){
        return singleton;
    }

}