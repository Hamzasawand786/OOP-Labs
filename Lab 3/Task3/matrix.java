class matrix{
public static void main(String [] args){
int [][] arr = {
               {12,13,15,16},
               {11,110,121,17}, 
               {17,18,100,21}
}; 
int add = 0;
for(int i=0; i<3; i++){
for(int j=0; j<4; j++){
if(arr[i][j]%2==0){
arr[i][j]=arr[i][j]/2;
}
}
}
System.out.println("All Odd Number from matrix ");
for(int i=0; i<3; i++){
for(int j=0; j<4; j++){
if(arr[i][j]%2!=0){
System.out.print(arr[i][j]+" ");
}
}
System.out.println();
}
for(int i=0; i<3; i++){
for(int j=0; j<4; j++){
if(arr[i][j]%2==0){
add+=arr[i][j];
}
}
}
System.out.println("Sum of Even Number: " + add);
}
}