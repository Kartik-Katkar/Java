import java.util.*;;
public class construct {
  int Sr_no;
  String Name;
  int Prn;
  int Rollno;

  public construct(int sr_no, String name, int prn,int rollno) {
    Sr_no = sr_no;
    Name = name;
    Prn = prn;
    Rollno = rollno;

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your id");
        int sr_no = sc.nextInt();
        System.out.println("Enter your prn");
        int prn = sc.nextInt();
        System.out.println("Enter your rollno");
        int rollno = sc.nextInt();



    construct student = new construct(sr_no, name,prn,rollno);
    System.out.println(student.Sr_no + " " + student.Name+" "+student.Prn+" "+student.Rollno);
     
       

        

        // student.setname(name1);
        // t.setid(id1);

  }
}