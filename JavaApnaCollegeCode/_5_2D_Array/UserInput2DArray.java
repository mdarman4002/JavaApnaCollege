import java.util.Scanner;
public class UserInput2DArray{
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at: "+ i +" "+j);
                    return true;
                }
            }
        }
        System.out.println("key not found");

        return false;

    }
    // finding largest 
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){ 
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element: "+ largest);

    }
    // finding smallest
    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){ 
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element: "+ smallest);

    }
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        // row
        System.out.println("row : ");
        int row = sc.nextInt();

        // column
        System.out.println("column: ");
        int column  = sc.nextInt();

        // 2D array declaration
        int[][] matrix = new  int[row][column];
        
        // taking input within the loop
        System.out.println("Enter the value at (i, j)");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.println("at index "+ i + " "+ j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("final 2D Array: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
        search(matrix, 5);
        largest(matrix);
        smallest(matrix);
        
    }
}
