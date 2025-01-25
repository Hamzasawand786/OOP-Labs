import java.util.Scanner;
class find{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int [] arr = {22,23,14,36,78,35};
int largest = arr[0];
int smallest = arr[0];
for(int i=0; i<arr.length; i++){
if(arr[i] < smallest){
smallest = arr[i];
}
if(arr[i] > largest){
largest = arr[i];
}
}
System.out.println("Smallest number: " + smallest);
System.out.println("Largest number: " + largest);

if(largest%2==0){
System.out.println("This largest number " + largest + " is multiple of 2 ");
}else{
System.out.println("This largest number " + largest + " is not multiple of 2 ");
}input.close();
}
}