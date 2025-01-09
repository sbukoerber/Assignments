/*Write a method called copyOf(), which accept an int array and returns a copy of the given array.
The method's signature is as follows:
public static int[] copyOf(int[] array)*/


package Q3;

import java.util.Arrays;

public class Q3_CopyOf {
    public static int[] copyOf(int[] array){
        
        return Arrays.copyOf(array, array.length);
    }
}