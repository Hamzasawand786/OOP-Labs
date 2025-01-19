import java.util.Scanner;
class Volume{
public static void main (String[] args){
Scanner scanner = new Scanner (System.in);
System.out.print("Enter Radius of Cylender ");
int Radius = scanner.nextInt();
System.out.print("Enter Hight of Cylender ");
int Hight = scanner.nextInt();
double result = Radius*Radius*Hight*3.14;
System.out.print("Volume of Cylender is: " + (result));
scanner.close();
}
}
