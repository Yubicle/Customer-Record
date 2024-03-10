/**
 * @author: Alokwe Udueshi Miracle, 1190195<br/>
 * Program Name: CustomerTester<br/>
 * Date: 08/02/2024<br/>
 * Purpose: A tester class to demonstrate Inheritance, Polymorphism, and the functionality of the
 *          abstract Customer class and the BusinessCustomer, RetailCustomer, and PreferredCustomer classes.
 */


public class CustomerTester {
    public static void main(String[] args) {

        // Output the program header.
        System.out.println("Welcome to the Customer tester!\n" +
                "---------------------------------------------------------------------------------------\n" +
                "This program will instantiate objects of the Customer hierarchy and test their methods\n" +
                "---------------------------------------------------------------------------------------");
        // Create an array of Customer objects
        Customer[] customerArray = new Customer[3];

        // Create 3 objects of classes inherited from the Customer superclass and assign them to elements/indexes of the array.
        customerArray[0] = new BusinessCustomer("Mike", "Holmes", "Business Customer", "Home Depot", 10, 3105.50);
        customerArray[1] = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00);
        customerArray[2] = new PreferredCustomer("Wei", "Ping", "Preferred Customer", 6456.85, 5);

        // A for-each loop to demonstrate polymorphism of all 3 classes' toString() methods.
        for (Customer customer : customerArray) {
            System.out.println(customer.toString());
        }

        // A for-each loop to demonstrate the functionality of the getters and setters of each object as well as their
        // incentives() method. Another great example of polymorphism. How fun...
        for (Customer customer: customerArray){
            System.out.printf("%s %s earns a discount incentive of $%.2f\n", customer.getFirstName(), customer.getLastName(), customer.incentives());
        }
        System.out.println(); // Formatting

        // Creation of 3 new objects of their corresponding data type without the constraint of being locked into the Customer object data type.
        BusinessCustomer a = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks", 15, 9875.25);
        RetailCustomer b = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
        PreferredCustomer c = new PreferredCustomer("Arti", "Patel", "Preferred Customer", 10450.00, 10);

        // Testing their toString() methods again to demonstrate polymorphism.
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        // Testing the objects' setters.
        a.setTotalPurchases(8895.00);
        b.setTotalPurchases(100500.00);
        c.setTotalPurchases(14987.24);
        c.setLastName("Patel-Ruhil");
        c.setCashbackRate(13);

        // Outputting the object states after they were updated to view the changes.
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }// end main
}// end class
