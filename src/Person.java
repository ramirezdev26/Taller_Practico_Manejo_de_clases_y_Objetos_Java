import java.util.Date;

/**
 * Representation of a Person with some attributes and get and set functions
 * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
 * */
public class Person {
    /**
     * Some attributes of the person
     * */
    public String name;
    public String lastName1;
    public String getLastName;
    public Date dateBirth;
    public float height;

    /**
     * Description: Return the name of the person
     * @return name of the person
     * */
    public String getName() {
        return name;
    }

    /**
     * Description: Set the value of the name attribute
     * @param name The name of the person
     * */
    public void setName(String name) {
        this.name = name;
    }
}

