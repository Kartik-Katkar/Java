/* write a java program for following develop a scenario in which the following exception occur
        1-arithmetic exception
        2- Array Index Out Of Bound
        3-Null pointer Exception*/
        import java.util.*;
        import java.io.*;
        import java.io.IOException;
        
        public class exp4 {
        
            public static void main(String[] args) throws IOException {
                System.out.println("Press 1 for arithmetic exception");
                System.out.println("Press 2 for array exception");
                System.out.println("Press 3 for null pointer exception");
                System.out.println("Press 4 for Arithmetic Exception using throw keyword");
                System.out.println("Press 5 for IOException");
                System.out.println("Enter your choice: ");
        
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
        
                switch (choice) {
                    case 1:
                        try {
                            int data = 10 / 0;
                        } catch (ArithmeticException e) {
                            System.out.println(e);
                            System.out.println("You shouldn't divide by 0");
                        }
                        break;
        
                    case 2:
                        int arr[] = new int[5];
        
                        try {
                            System.out.println(arr[7]);
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            System.out.println(e1);
                            System.out.println("Array index is out of bounds for 7");
                        }
                        break;
        
                    case 3:
                        String s = null;
                        try {
                            System.out.println(s.length());
                        } catch (NullPointerException e2) {
                            System.out.println(e2);
                            System.out.println("Null pointer Exception Arises");
                        }
                        finally {
                            System.out.println("always executed");
                        }
                        break;
                    case 4:
                        System.out.println("Enter Your Age :-");
                        int age = sc.nextInt();
        
                        if (age < 18) {
                            //throw Arithmetic exception if not eligible to vote
                            throw new ArithmeticException("Person is not eligible to vote");
                        } else {
                            System.out.println("Person is eligible to vote!!");
                        }
                    case 5:
                        try {
                            // Creating an instance of FileReader class
                            FileReader fileReader = new FileReader("Test.txt");
        
                            System.out.println(fileReader.read());
        
                            fileReader.close();
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
        
                    default:
                        System.out.println("Wrong Choice");
        
                }
        
            }
        }