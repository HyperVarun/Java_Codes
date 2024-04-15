// Take m and n from the user and m*n integer input from user and print the following:
/*number of postive number
number of negative number
number of odd number
numver of even number
number of zero's number*/

class CountArray
{
    public static void main(String args[])
    {
        int [][] arr={{1,2,-3,4},
                        {0,0,-4,2},
                        {1,-1,2,3},
                        {-4,-5,-7,0}};
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
