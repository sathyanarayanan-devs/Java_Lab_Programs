package Program2;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        //Scanner Object
        Scanner sc = new Scanner(System.in);
        
        //----- 1D Array -----
        int[] arr = new int[5];
        int sum = 0;
        System.out.println("Enter 5 numbers for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("\nElements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }

        System.out.println("\nSum of array elements: " + sum);

        //----- 2D Array -----
        int[][] matrix = new int[2][2];
        System.out.println("\nEnter elements for a 2x2 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nElements in the 2x2 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //----- String Operations -----
        System.out.print("\nEnter a string: ");
        String inputString = sc.next();
        System.out.println("You entered: " + inputString);
        System.out.println("Length of the string: " + inputString.length());
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());
        System.out.println("Reversed string: " + new StringBuilder(inputString).reverse());

        //----- StringBuffer Operations -----
        StringBuffer sb = new StringBuffer(inputString);
        sb.append(" Java");
        System.out.println("\nStringBuffer after appending: " + sb);

        sb.insert(0, "Hello ");
        System.out.println("StringBuffer after inserting: " + sb);

        sb.delete(0, 6);
        System.out.println("StringBuffer after deleting: " + sb);

        sb.replace(0, 4, "Hi");
        System.out.println("StringBuffer after replacing: " + sb);

        sb.reverse();
        System.out.println("StringBuffer after reversing: " + sb);

        sc.close();
    }
}
