/**
 * Representation of a cell phone with some attributes and get and set functions
 * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
 */
public class CellPhone {
    /**
     * Some attributes of a Cell Phone
     * */
    public String reference;
    private int number;
    protected boolean camera = true;

    /**
     * Description: Return the name of the cellphone's reference
     * @return name of the reference
     * */
    public String getReference() {
        return reference;
    }

    /**
     * Description: Set the value of the cellphone's reference
     * @param reference The value of the cellphone's reference
     * */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Description: Return the value of the cellphone's number
     * @return cellphone's number
     * */
    public int getNumber() {
        return number;
    }

    /**
     * Description: Set the number of the cellphone
     * @param number The value of the cellphone's number
     * */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Description: Return the status of the camera
     * @return status of camera
     * */
    public boolean isCamera() {
        return camera;
    }

    /**
     * Description: Set the statues of cellphone's camera
     * @param camera The status of cellphone's camera
     * */
    public void setCamera(boolean camera) {
        this.camera = camera;
    }
}
