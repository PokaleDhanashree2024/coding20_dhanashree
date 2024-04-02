import java.util.*;
public class UniqueNumbers{
    public static void main(String[] args)
    {
        int[] array={1,3,5,7,9,11};
        System.out.println("Orignal Array:");
        printArray(array);
        System.out.println("\nUnique Numbers:");
        printlUniqueNumbers(array);

    }
    numbers in an array
    public static void
    printUniqueNumbers(int[]arr)
    {
        Set<Integer>uniqueSet=newHashSet<>();
        for(int num:arr)
        {
            uniqueSet.add(num);

        }
        for(int uniqueNum:uniqueSet)
        {
            System.out.print(uniqueNum+"");
        }
    }
    public static void printArray(int[] arr)
    {
        for(int num:arr)
        {
            System.out.print(num+"");
        }
    }
}