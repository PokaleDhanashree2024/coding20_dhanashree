import java.util.Scanner;
public class sortArray
{
    public static void main(String [] args)
    {
        int[] array={ 2,7,9,4,6,8};
        sortFirstHalfAscending(array);
        sortSecondHalfDescending(array);
        System.out.println("Sorted array");
        for(int num: array)
        {
            System.out.println(num+"");
        }
    }
    public static void sortFirstHalfAscending(int[] array)
    for(int i=0;i<array.length/2-1;i++)
    {
        for(int j=i+1;j<array.length/2;j++)
        {
            if(array[i]>array[j])
            {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;             
            }
        }
    }
}
public static void sortSecondHalfDescending(int[ array])
{
    for(int i=array.length/2;i<array.length-1;i++)
    {
        for(int j=i+1;j<array.length;j++)
        {
             if(array[i]<array[j])
             {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;

             }
             
        }
    }
}