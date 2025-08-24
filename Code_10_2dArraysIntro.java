package SwaraliPractice;
import java.util.Scanner;
public class Code_10_2dArraysIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowSize=sc.nextInt();
        int colSize=sc.nextInt();
        int [][] matrix= new int [rowSize][colSize];
        for(int i=0; i<rowSize; i++){
            for(int j=0;j<colSize; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
   // rowsize- matrix.length , column size- matrix[0].length
        for(int i=0; i<rowSize; i++){
            for(int j=0;j<colSize; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to search in the matrix:");
        int search=sc.nextInt();
        for(int i=0; i<rowSize; i++){
            for(int j=0;j<colSize; j++) {
                if(matrix[i][j]==search)
                    System.out.println("Element found at location ("+i+","+j+")");
            }
        }

    }
}
