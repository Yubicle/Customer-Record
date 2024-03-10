import static java.lang.Character.toUpperCase;

/**
 * @author: Alokwe Udueshi Miracle, 1190195<br/>
 * Program Name: Customer<br/>
 * Date: 08/02/2024<br/>
 * Purpose: An abstract Customer class at the top of the Class hierarchy with 4 private fields,
 *          a 3-arg constructor that initialises the fields, a set of getters and setters for the fields,
 *          an abstract incentives() method overridden by 2 classes, and an overridden toString() method.
 */


public abstract class Customer {
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;

    /**
     * This constructor also sets a customerID with the corresponding setter method.
     * @param firstName Customer First Name
     * @param lastName Customer Last Name
     * @param customerLevel Customer Category(Retail, Business, Preferred)
     */
    public Customer(String firstName, String lastName, String customerLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        setCustomerID();
    } // end 3-arg constructor

    /**
     * @return Customer First Name as a String.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName Update the customer's first name with this String parameter.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Customer Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName Update the customer's last name with this String parameter.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Customer ID generated at object creation.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Purpose: This setter method builds a new string of 4 alphabet characters
     *          taken from the customer's last name and adds a hyphen and 5 randomly
     *          generated numbers between 0 and 9 both inclusive. If the customer's
     *          last name is less than 4 characters long, it instead pads the alphabet
     *          part of the generated ID with 'X's.<br/>
     *          <br/>
     *          The format is XXXX-00000. Where X is a letter and 0 is a number.
     */
    private void setCustomerID() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (i < getLastName().length()) {
                str.append(toUpperCase(getLastName().charAt(i)));
            }
            else {
                str.append("X");
            }
        } // end for-loop
        str.append("-");
        for(int i = 0; i < 5; i++){
            str.append((int) (Math.random() * 10));
        }

        customerID = String.valueOf(str);
    }

    /**
     * @return Customer Level as a String.
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    /**
     * @param customerLevel Update the customer's level with this String parameter.
     */
    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    /**
     * @return Customer incentive as a double.<br/>
     *         This method is overridden in several subclasses as needed.
     */
    public abstract double incentives();

    /**
     * @return Outputs state of the Customer object as a formatted String.<br/>
     *         This method is overridden in several subclasses as needed.
     */
    public String toString(){
        return getCustomerID() + ", " + getFirstName() + " " + getLastName() + "\n" +
                getCustomerLevel();
    } // end toString
}// end class
