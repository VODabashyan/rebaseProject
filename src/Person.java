import java.io.Serializable;

//to make a class serializable we need to implement the Serializable interface.
public class Person implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 4801633306273802062L; //we get a warning when not adding a serialVersionUID we "add generated serial version UID" to get rid of the warning. In this case a serialVersionUID with a random number
    //"4801633306273802062L" is added. So, in order to deserialize(read from a file) the objects that we've previously serialized (written to a file)
    //and if serialVersionUID was defined when serializing the objects, then serialVersionUID must be the same when deserializing that objects. In other words, the serialVersionUID
    //of the class Person must be the same when serializing and deserializing the objects of Person class. So, this is simply a way of checking that we are reading with the exact same
    //class that we wrote with. So, the main use of serialVersionUID is to stop the newer versions of our class/program to read the objects serialized with very old versions of that
    //class/program by simply changing the serialVersionUID.
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

}
