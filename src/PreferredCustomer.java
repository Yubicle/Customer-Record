/**
 * @author: Alokwe Udueshi Miracle, 1190195<br/>
 * Program Name: PreferredCustomer<br/>
 * Date: 08/02/2024<br/>
 * Purpose: A PreferredCustomer class definition/implementation, with a 5-arg constructor,
 *          a getter and a setter for the private field, an overridden incentives() method,
 *          and an overridden toString() method.
 */

public class PreferredCustomer extends RetailCustomer{
    private int cashbackRate;

    /**
     * @author Alokwe Udueshi Miracle, 1190195
     * @param firstName Customer First Name
     * @param lastName Customer Last Name
     * @param customerLevel Customer Category(Retail, Business, Preferred)
     * @param totalPurchases Total amount of Customer Purchases in $.
     * @param cashbackRate The cashback rate of the customer per purchase.
     */
    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashbackRate = cashbackRate;
    } // end 5-arg constructor

    /**
     * @return Cashback rate as a double.
     */
    public int getCashbackRate() {
        return cashbackRate;
    } // end getCashbackRate

    /**
     * @param cashbackRate Update the customer's cashback rate with this int parameter.
     */
    public void setCashbackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }// end setCashbackRate

    /**
     * @return The customer's incentive <br/> (Discount amount + (Discount Amount * Cashback rate in percentage(0-100%)))
     */
    public double incentives(){
        double discAmt = this.getTotalPurchases() * ((double) this.findDiscountRate() / 100);
        return discAmt + (discAmt * ((double)this.getCashbackRate()/100));
    } //end incentives

    /**
     * @return Outputs state of the Preferred Customer object along with their cashback rate as a formatted string.
     */
    public String toString(){
        return super.toString() +
                String.format("Cashback Rate:         %d%%\n", getCashbackRate());
    }// end toString
}// end class
