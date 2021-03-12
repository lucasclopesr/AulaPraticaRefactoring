import java.util.Enumeration;

public abstract class Statement {

    public abstract String getStringResult(Customer aCustomer);

    public abstract String addRental(Rental aRental);

    public abstract String getFooter(Customer aCustomer);

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
