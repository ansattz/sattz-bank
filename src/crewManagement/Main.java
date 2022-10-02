package crewManagement;

public class Main {

   public static void main(String[] args) {
      Admin Douglas = new Admin();
      Manager Junior = new Manager();
      Client Mario = new Client();

      AuthSystem sys = new AuthSystem();
      Douglas.setPassword(2022);
      Mario.setPassword(1337);
      Junior.setPassword(2019);

      sys.verify(Douglas);
      sys.verify(Mario);
      sys.verify(Junior);

      // Only Douglas was authenticated.

      System.out.println(Douglas.verify(2000));
      // check Douglas's password (false)
      System.out.println(Mario.verify(1337));
      // check Mario's password (true)
   }
}
