import java.util.Enumeration;

public class TextStatement extends Statement {

    private String getStringResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    private String addRental(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n";
    }

    private String getFooter(Customer aCustomer){
        return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n" + "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = this.getStringResult(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += this.addRental(each);
      }
      //add footer lines
      result += this.getFooter(aCustomer);
      return result;
   }

}
