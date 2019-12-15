import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization, if you take an object and serialize it, it means turning that object into a kind of binary form (into binary data).
//If we de-serialize an object, it means taking binary data and turning it back into an object.
//Here we look at serializing files. We are going to take the objects of Person type and write them to a file and
//read them back from the file (taking the objects out of the file and turning them back into objects in a Java program).
//In Java we may have more than one "main" method in our program(project), but we should pick one "main" method as a
//starting point for our program to run it. The other "main" methods in out project can be used to test stuff
//(some parts of the program/project).
//We may use serialization implement saving and loading functionality in our programs.

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person mike = new Person(543, "Mike", "mike@mike.com");
        Person sue = new Person(123, "Sue", "sue@sue.com");
        Person jane = new Person(126, "jane", "jane@sue.com");

        System.out.println(mike);
        System.out.println(sue);
        System.out.println(jane);

        //FileOutputStream class lets us stream(send sequentially) data to a file
        //the provided file may have any extension, but ".data" or  ".bin" are typical for binary files.
        //if we just give the file name(not the path), then file will be stored in the working directory (project folder)
        //of our program.
        //using try with resources syntax, "fs.close()" method is called automatically.
        try(FileOutputStream fs = new FileOutputStream("people.bin")) {

            //we pass "fs" to allow ObjectOutputStream to stream/write data to our file.
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {//will be called if we can't create "people.bin" file.
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {//will be thrown if we can't write to "people.bin" file for some reason.
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
