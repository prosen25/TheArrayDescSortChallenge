import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int arrayLength = 10;
        int[] intArray = new int[arrayLength];
        int[] reverseIntArray = new int[arrayLength];

        // Create an array with random number
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = random.nextInt(100);
        }

        // Print the random unsorted array
        System.out.println(Arrays.toString(intArray));

        // Sort the array in ascending order
        Arrays.sort(intArray);

        // Print the ascending sorted array
        System.out.println(Arrays.toString(intArray));

        // Reverse the order of the array
        int j = 0;
        for (int i = arrayLength - 1; i >= 0; i--) {
            reverseIntArray[j] = intArray[i];
            j++;
        }

        // Print the reverse sorted
        System.out.println(Arrays.toString(reverseIntArray));
    }
}