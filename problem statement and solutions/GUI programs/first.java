import java.util.Scanner;
public class first{
   
   String name;
   int id;
   private String Hobby; // private = restricted access

  // Getter
  public String getName() {
    return Hobby;
  }

  // Setter
  public void setName(String newName) {
    this.Hobby = newName;
  }
  
  first()
  {

  }
   first(String name,int id){
   this.name = name;
   this.id = id;
  
   }

   public static void main(String[] args) {
      System.out.println("Enter your name");
      Scanner sc = new Scanner(System.in);
      String name1 = sc.nextLine();
      System.out.println("Enter your id");
      int id1 = sc.nextInt();

      // getter setter start 
    first myObj = new first();
    myObj.setName("Tommy buoy"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
      // getter setter end 

    first obj1 = new first(name1,id1);

    System.out.println("Your name is "+obj1.name+" and Your id is "+obj1.id);


   }
}

