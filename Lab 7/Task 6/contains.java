import java.util.Scanner;
public class contains {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        if(string.contains("Java")){
            System.out.println("String contains Java");
        }else{
            System.out.println("String does not contain Java");
        }
        input.close();

    }
}
