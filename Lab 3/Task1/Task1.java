import java.util.Scanner;
class Task1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Prime Number range from: ");
int num1 = input.nextInt();
System.out.print("Enter Prime Number range to: ");
int num2 = input.nextInt();
for(int i = num1; i<=num2; i++){
boolean isPrime = true;
for(int j=2; j<i; j++){
if(i%j==0){
isPrime=false;
break;
}
}
if(isPrime){
System.out.println(i);
}
}
}
}


