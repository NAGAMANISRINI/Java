import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = obj.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}