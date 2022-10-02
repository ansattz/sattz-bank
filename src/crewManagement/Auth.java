package crewManagement;

public abstract interface Auth {
   // since java does not have multiple inheritance
   // (a class can only inherit from one other class)
   // we can use interfaces to accomplish this,
   // because the class you want to do multiple
   // inheritance can use implements -- similar
   // to extends.
   public abstract void setPassword(int password);

   public abstract boolean verify(int password);
}
