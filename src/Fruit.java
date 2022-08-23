import java.util.ArrayList;
import java.util.List;

  /**
  * Representation of a Fruit with some attributes and get and set functions
  * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
  */
public class Fruit {
    /**
     * Some attributes of the fruit
     * */
    public String name;
    private float averageWeight;
    public List<String> colors = new ArrayList<>();

    /**
     * Description: Return the array of colors of the fruit
     * @return Array of colors
     * */
    public List<String> getColors() {
        return colors;
    }

    /**
     * Description: Add a new color to the array of colors
     * @param name The name of the new color
     * */
    public void setColors(String name) {
        colors.add(name);
    }
}
