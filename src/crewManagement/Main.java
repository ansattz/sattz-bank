package crewManagement;

public class Main {

   public static void main(String[] args) {
      Manager mario = new Manager();
      Programmer douglas = new Programmer();
      CrewSystem sys = new CrewSystem();

      mario.setPassword(2022);
      sys.verify(mario);
   }
}
