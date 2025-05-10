import java.util.Scanner;
public class Matrix {
    int rows;
    int columns;
    int [][] matx;
Matrix(int rows, int columns){
    this.rows = rows;
    this.columns = columns;
    this.matx = new int[rows][columns];
}
void inputMatrix(){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the elements of matrix " + rows + " x " + columns);
    for (int i = 0; i<rows; i++){
        for (int j = 0; j<columns; j++){
            System.out.println("Enter elements at " + i + j );
            matx[i][j] = input.nextInt();
        }
    }
}
void get_matrix(){
    System.out.println("Matrix " + rows + columns );
    for (int i = 0; i<rows; i++){
        for (int j = 0; j<columns; j++){
            System.out.println(matx[i][j] + " ");
        }
        System.out.println();
    }
}
void set_elements(int row, int column, int value){
    if(row >= 0 && row < rows && column >= 0 && column < columns){
        matx[row][column] = value;
    }else{
        System.out.println("Invalid row or column index ");
    }
}

public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    Matrix matrix1 = new Matrix(4,3);
    matrix1.inputMatrix();
    matrix1.set_elements(1,2,3);
    System.out.println("\nMatrix 1 after update: ");
    matrix1.get_matrix();

    Matrix matrix2 = new Matrix(3,3);
    matrix2.inputMatrix();
    System.out.println("\nMatrix 2:");
    matrix2.get_matrix();
    input.close();
}

    }