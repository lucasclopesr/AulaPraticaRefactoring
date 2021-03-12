import java.util.Enumeration;

public class TextStatement extends Statement {

    public String getStringResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    public String addRental(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n";
    }

    public String getFooter(Customer aCustomer){
        return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n" + "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }

}
