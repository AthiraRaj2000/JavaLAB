import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();
        
        boolean found = false;
        
        
        for(int i=0; i<size; i++) {
            if(arr[i] == searchElement) {
                found = true;
                break;
            }
        }
        
        
        if(found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}

