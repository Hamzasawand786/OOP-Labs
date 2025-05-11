import java.util.Scanner;
public class replace {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Spaced String: ");
        String string = input.nextLine();

        System.out.println("Modified String without Spaces: " + "\n" + string.replace(' ','\0'));

        input.close();
    }
}
