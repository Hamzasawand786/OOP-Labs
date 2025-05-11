import java.util.Scanner;
public class startwith {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        if(string.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }else{
            System.out.println("String does not start with Hello");
        }
        input.close();

    }
}
