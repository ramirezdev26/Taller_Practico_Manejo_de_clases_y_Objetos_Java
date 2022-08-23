/**
 * Representation of a Motorcycle with some attributes and get and set functions
 * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
 */
public class Motorcycle {
    /**
     * Some attributes of the Motorcycle
     * */
    public String engine;
    public String color;
    private String numberChassis;

    /**
     * Description: Return the value of the engine
     * @return name of the engine
     * */
    public String getEngine() {
        return engine;
    }

    /**
     * Description: Set the value of the engine attribute
     * @param engine The value of the engine
     * */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Description: Return the value of the color of the motorcycle
     * @return color of the motorcycle
     * */
    public String getColor() {
        return color;
    }

    /**
     * Description: Set the value of the color attribute
     * @param color The value of the color
     * */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Description: Return the value of the number of the chassis
     * @return number of chassis
     * */
    public String getNumberChassis() {
        return numberChassis;
    }

    /**
     * Description: Set the value of the number of chassis
     * @param numberChassis The value of the numberChassis
     */
    public void setNumberChassis(String numberChassis) {
        this.numberChassis = numberChassis;
    }
}
