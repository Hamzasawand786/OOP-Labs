import java.util.Scanner;
public class toUpperCase {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String[] strings = new String[5];

        for (int i=0; i<strings.length; i++){
            System.out.println("Enter String " + (i + 1) + ": " );
            strings[i] = input.nextLine();
        }
        System.out.println("\n Strings in Uppercase: ");
        for (int i = 0; i< strings.length; i++){
            System.out.println(strings[i].toUpperCase());
        }
        input.close();
    }
}
