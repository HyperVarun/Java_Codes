// Take m and n from the user and m*n integer input from user and print the following:
/*number of postive number
number of negative number
number of odd number
numver of even number
number of zero's number*/
import java.util.*;
class CountArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array:");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element at row " + i + " and column " + j + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        int npn=0;
        int nnn=0;
        int non=0;
        int nen=0;
        int noo=0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<0)
                {
                    nnn=nnn+1;
                }
               if(arr[i][j]>0)
                {
                    npn=npn+1;
                }
                if(arr[i][j]%2!=0)
                {
                    non=non+1;
                }
                if(arr[i][j]%2==0)
                {
                    nen=nen+1;
                }
                if(arr[i][j]==0)
                {
                    noo=noo+1;
                }
            }
        }
        System.out.println(npn);
       System.out.println(nnn);
        System.out.println(non);
        System.out.println(nen);
        System.out.println(noo);
    }
}
