import java.util.Scanner;
class Speed{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Speed in mph: ");
int mph = scanner.nextInt();
double result = mph*1.609344;
System.out.print("Speed in kmph is " + (result));
scanner.close();

}
}

