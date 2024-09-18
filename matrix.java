import java.util.*;
public class matrix{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix : ");
        int rows = obj.nextInt();
        System.out.print("Enter the number of cols in the matrix : ");
        int cols = obj.nextInt();
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] product = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                mat1[i][j] = obj.nextInt();
             }
        }
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                mat2[i][j] = obj.nextInt();
             }
        }
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                sum[i][j] = mat1[i][j] + mat2[i][j];
             }
        }
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                for(int k=0;k<cols;k++)
                {
                    product[i][j] = product[i][j] + mat1[i][k] * mat2[k][j];
                }
             }
        }
        System.out.println("sum of matrix : ");
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                System.out.println(sum[i][j] + " ");
             }
        }
        System.out.println("product of matrix : ");
        for(int i=0;i<rows;i++)
        {
             for(int j=0;j<cols;j++)
             {
                System.out.println (product[i][j] + " ");
             }
        }
    }
}