import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * @author: Alokwe Miracle, 1190195
 * Program Name: pacman
 * Date: 24/02/2024<br/>
 * Purpose: REPLACE THIS LINE
 */


public class pac {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;
        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            try {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
                inputName = scnr.next();
            }
            catch(InputMismatchException e) {
                System.out.println(inputName + " " + 0);
                scnr.nextLine();
            }
            finally {
                inputName = scnr.next();
            }
        }
    }
}
