import java.util.*;

public class test {

    String name;
    int id;

    void setname(String name1) {
        this.name = name1;
    }

    void setid(int id1) {
        this.id = id1;
    }

    public static void main(String[] args) {
        test t = new test();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name1 = sc.next();

        System.out.println("Enter your id");
        int id1 = sc.nextInt();

        t.setname(name1);
        t.setid(id1);
        
        

    }
}
