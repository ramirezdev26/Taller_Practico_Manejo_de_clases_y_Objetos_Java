/**
 * Representation of a Motorcycle with some attributes and get and set functions
 * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
 */
public class BankAccount {
    /**
     * Some attributes of a Cell Phone
     * */
    private int accountNumber;
    protected boolean activated;

    /**
     * Description: Return the status of the account
     * @return status of account
     * */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Description: change the statues of account
     * @param activated The status of account
     * */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
