import java.util.Scanner;
import java.util.ArrayList;

public class exp2 {

    int sum;
    
    public static void main(String[] args) {

        ArrayList<Integer> result=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the number of elements you want in array");
        int k = sc.nextInt();
        int[] arr = new int[k];


        for (int i = 0; i < k; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
            System.out.println("Your entered value is: " + arr[i]);
        }

        System.out.println("Enter the target sum");
        int targetsum = sc.nextInt();

        for (int i = 0; i < (k-1); i++) {
            int temp = arr[i];
            int sub = targetsum - temp;
            for (int j = i+1; j < k; j++) {
                if(sub == arr[j])
                {
                    result.add(arr[j]);
                    result.add(arr[i]);
                }
            }
        }

        System.out.println(result);
    }
}