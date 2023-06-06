import java.io.IOException;  
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class student {
    void student_detail()  {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the student name");
            String sname = br.readLine();
            System.out.println("Your name is : "+sname);
        } catch (Exception e) {
       System.out.println("Exception: " + e);
        }
    }

    public static void main(String[] args) {
       student obj = new student();
       obj.student_detail();
    }
}
