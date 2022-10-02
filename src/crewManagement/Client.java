package crewManagement;

public class Client implements Auth {
   // a class can use implements to use
   // multiple interfaces.
   private AuthComp comp;

   public Client() {
      this.comp = new AuthComp();
   }

   @Override
   public void setPassword(int password) {
      this.comp.setPassword(password);
   }

   @Override
   public boolean verify(int password) {
      return this.comp.verify(password);
   }
}
