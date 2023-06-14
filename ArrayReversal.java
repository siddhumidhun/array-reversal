public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: ");
        printArray(array);
        
        reverseArray(array);
        
        System.out.println("Reversed array: ");
        printArray(array);
    }
    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end positions
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the start and end pointers towards the center
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
