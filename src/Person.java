import java.io.Serializable;

public class Person implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 4801633306273802062L;
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person (" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ')';
    }
}
