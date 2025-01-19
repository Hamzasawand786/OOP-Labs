import java.util.Scanner;
class Converter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value in Dollar:");
int dollar = scanner.nextInt();
System.out.println("Converted value: " + (dollar * 280.0));
System.out.println("Build Successful");
scanner.close();
    }
}
