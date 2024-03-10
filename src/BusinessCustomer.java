/**
 * @author: Alokwe Udueshi Miracle, 1190195<br/>
 * Program Name: BusinessCustomer<br/>
 * Date: 08/02/2024<br/>
 * Purpose: A BusinessCustomer class definition/implementation, with a 6-arg constructor,
 *          a set of getters and setters for each of the class' 3 private fields,
 *          an overridden incentives() method, and an overridden toString() method.
 */

public class BusinessCustomer extends Customer{

    private String companyName;
    private int discountRate;
    private double totalPurchases;

    /**
     * @author Alokwe Udueshi Miracle, 1190195
     * @param firstName Customer First Name
     * @param lastName Customer Last Name
     * @param customerLevel Customer Category(Retail, Business, Preferred)
     * @param companyName Customer Company Name
     * @param discountRate Customer Discount Rate
     * @param totalPurchases Total amount of Customer Purchases in $.
     */
    public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }//end 6-arg constructor

    /**
     * @return The customer's company name as a String.
     */
    public String getCompanyName() {
        return companyName;
    }// end getCompanyName

    /**
     * @param companyName Update the customer's company name with this String parameter.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }//end setCompanyName

    /**
     * @return The discount rate as an int.
     */
    public int getDiscountRate() {
        return discountRate;
    }//end getDiscountRate

    /**
     * @param discountRate Update the customer's discount rate with this int parameter.
     */
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    } //end setDiscountRate

    /**
     * @return Total Purchases as a double.
     */
    public double getTotalPurchases() {
        return totalPurchases;
    }// end getTotalPurchases

    /**
     * @param totalPurchases Update the customer's total purchases with this double parameter.
     */
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }//end setTotalPurchases
    public double incentives() {
        return totalPurchases * ((double) discountRate / 100);
    }//end incentives

    /**
     * @return Outputs the state of the Business Customer object along with the company
     *         name of the customer as a formatted string.
     */
    public String toString(){
        return super.toString() + " for " + getCompanyName() + "\n" +
                String.format("Total Purchases:       $%,.2f", getTotalPurchases())  + "\n" +
                "Discount Rate:         " + getDiscountRate() + "%" + "\n" +
                String.format("Discount Incentive:    $%,.2f", incentives()) + "\n" +
                String.format("Net Purchases:         $%,.2f", (getTotalPurchases() - incentives())) + "\n";
    }//end toString
}// end class
