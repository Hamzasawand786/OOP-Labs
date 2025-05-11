import java.util.Scanner;
public class findIndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any String ");
        String input = scanner.nextLine();

        int index = input.indexOf('a');
        if (index != -1) {
            System.out.println("The first occurrence of 'a' is at index: " + index);
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }

}
