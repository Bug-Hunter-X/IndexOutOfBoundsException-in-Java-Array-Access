public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This line will still throw the exception
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds: " + e.getMessage());
        }
    }
}