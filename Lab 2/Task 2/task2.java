import java.util.Scanner;
class task2{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
int [] intiger = new int [10];
int add = 0;
for(int i=0; i<10; i++){
intiger[i]=scanner.nextInt();
}
for(int i=0; i<10; i++){
System.out.println(" "+ intiger[i]);
if(intiger[i] % 4 == 0){
add +=intiger[i];
}
}
System.out.println(add);
}
}