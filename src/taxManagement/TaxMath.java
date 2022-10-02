package taxManagement;

public class TaxMath {
   private double totalTax;

   public void registry(Tax t) {
      // input for get what is "taxable"
      double value = t.getTaxValue();
      this.totalTax += value;
   }

   public double getTotalTax(){
      return totalTax;
   }
}
