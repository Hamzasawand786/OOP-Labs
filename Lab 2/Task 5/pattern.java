class pattern{
public static void main(String[] args) {
int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1}
        };
for(int i=0; i<matrix.length; i++){
for(int j=0; j<5; j++){
System.out.print(matrix[i][j]+" ");
}
System.out.println(" ");
}
if(matrix[0][1]==1||matrix[1][2]==1||matrix[2][3]==1){
System.out.println("   ");
System.out.println("Yes it is N ");
}else{
System.out.print("No it is not N ");
}
}
}
