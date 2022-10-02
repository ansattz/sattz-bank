package taxManagement;

public class LifeInsurance implements Tax {

   @Override
   public double getTaxValue() {
      return 50;
   }
}
