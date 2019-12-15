import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try(FileInputStream fi = new FileInputStream("people.bin")) {//we pass the name of the file that we want to read from

            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person)os.readObject(); //as readObject() returns an Object we need to cast it to Person type of object.
            Person person2 = (Person)os.readObject();

            os.close();

            //to make sure that we've read the objects. By the way, we've read them in the same order as in case of writing.
            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {//will be thrown if we can't read from "people.bin" file.
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {//this will be thrown if readObject() reads an object of a class that doesn't exist in this program
            //i.e we will get this exception if we try to read an object of a class that isn't defined in our program
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
