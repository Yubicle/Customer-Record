/**
 * @author: Alokwe Udueshi Miracle, 1190195<br/>
 * Program Name: RetailCustomer<br/>
 * Date: 08/02/2024<br/>
 * Purpose: A RetailCustomer class definition/implementation, with a 4-arg constructor,
 *          a getter and a setter for the private field, an overridden incentives() method,
 *          a method to assign a discount rate to the customer, and an overridden toString()
 *          method.
 */
public class RetailCustomer extends Customer{
    private double totalPurchases;

    /**
     * @author Alokwe Udueshi Miracle, 1190195
     * @param firstName Customer First Name
     * @param lastName Customer Last Name
     * @param customerLevel Customer Category(Retail, Business, Preferred)
     * @param totalPurchases Total amount of Customer Purchases in $.
     */
    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
        // 4-arg constructor for a RetailCustomer object.
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }//end 4-arg constructor

    /**
     * @return Total Purchases as a double.
     */
    public double getTotalPurchases() {
        return totalPurchases;
    }//end getTotalPurchases

    /**
     * @param purchases Update the customer's total purchases with this double parameter.
     */
    public void setTotalPurchases(double purchases) {
        this.totalPurchases = purchases;
    } // end setTotalPurchases

    /**
     * @return A discount rate in percent(0-15%) depending on the user's total purchase amount.
     */
    public int findDiscountRate(){
        if (totalPurchases > 10000){
            return 15;
        }
        else if (totalPurchases > 5000){
            return 10;
        }
        else if (totalPurchases > 1000){
            return 5;
        }
        else{
            return 0;
        }
    }// end findDiscountRate

    /**
     * @return The user's incentive <br/> (Total Purchases multiplied by their Discount rate)
     */
    public double incentives() {
        return this.totalPurchases * ((double) this.findDiscountRate() / 100);
    } // end incentives

    /**
     * @return Outputs state of the Retail Customer object along with their net purchases as a formatted string.
     */
    public String toString(){
        return super.toString() + "\n" +
                String.format("Total Purchases:       $%,.2f\n", this.getTotalPurchases()) +
                String.format("Discount Rate:         %d%%\n", findDiscountRate()) +
                String.format("Discount Incentive:    $%,.2f\n", this.incentives()) +
                String.format("Net Purchases:         $%,.2f\n", (this.getTotalPurchases() - this.incentives()));
    }// end toString
}// end class
