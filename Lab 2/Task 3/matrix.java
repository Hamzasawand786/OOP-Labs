import java.util.Scanner;
class matrix{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Array Value ");
int row = input.nextInt();
int col = input.nextInt();
int [][] matrix1 = new int [row][col];
int [][] matrix2 = new int [row][col];
System.out.println("Enter values of First Matrix ");
for(int i=0; i<row; i++){
for(int j=0; j<col; j++){
matrix1[i][j]=input.nextInt();
}
}
System.out.println("Enter values of Secound Matrix ");
for(int i=0; i<row; i++){
for(int j=0; j<col; j++){
matrix2[i][j]=input.nextInt();
}
}
System.out.println("===========OutPut============");
for(int i=0; i<row; i++){
for(int j=0; j<col; j++){
System.out.print((matrix1[i][j]+=matrix2[i][j])+ " ");
}
System.out.println();
}

}
}


